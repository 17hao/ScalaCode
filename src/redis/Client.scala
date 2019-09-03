package redis

import akka.actor.ActorSystem

import scala.concurrent.ExecutionContext.Implicits.global

object Client extends App {
  implicit val akkaSystem: ActorSystem = akka.actor.ActorSystem()
  val client = RedisClient()
  println("Ping sent!")
  client.ping().map(pong => println(s"Redis replied with $pong"))
  client.setnx("fruit", "apple")
  client.setnx("fruit", "orange")
  client.lpush("fruits", "banana")
  client.lpushx("fruits", "pear")
  client.hmset("user:1", Map("name" -> "sqh"))
  client.stop()
}
