package xyz.shiqihao.misc.redis

import akka.actor.ActorSystem
import com.typesafe.config.{Config, ConfigFactory}
import javax.inject.Singleton
import redis.{RedisClientPool, RedisServer}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

@Singleton
class RedisCacheClient {
  implicit val actorSystem: ActorSystem = akka.actor.ActorSystem()
  val config: Config = ConfigFactory.load()
  private[this] val cache = RedisClientPool(
    Seq(RedisServer(config.getString("redis.url"), config.getInt("redis.port"))))

  def put(key: String): Future[Boolean] = {
    cache.set(key, "1")
  }

  def get(key: String): Future[String] = {
    cache.get(key) map {
      case None => ""
      case Some(value) => value.toString()
    }
  }

  def putV2(key: String): Future[Boolean] = {
    cache.setnx(key, "1")
  }
}
