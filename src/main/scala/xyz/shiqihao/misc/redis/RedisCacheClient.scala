package xyz.shiqihao.misc.redis

import akka.actor.ActorSystem
import javax.inject.Singleton
import redis.RedisClient

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

@Singleton
class RedisCacheClient[T] {
  implicit val actorSystem: ActorSystem = akka.actor.ActorSystem()
  private[this] val redisClient = RedisClient()

  def put(key: String): Future[Boolean] = {
    redisClient.set(key, "1")
  }

  def get(key: T): Future[Option[T]] = {
    redisClient.get(key.toString) map {
      case None => None
      case Some(value) => Some(value.asInstanceOf[T])
    }
  }

  def setnx(key: String): Future[Boolean] = {
    redisClient.setnx(key, "1")
  }
}

object RedisCacheClient {
  def apply[T](): RedisCacheClient[T] = new RedisCacheClient()
}