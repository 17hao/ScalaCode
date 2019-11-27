package xyz.shiqihao.misc.redis

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object Client_2 extends App {
  val cache = RedisCacheClient[String]()
  val l = List("test1", "test2", "test3")
  println(l.map(setnx))
  println(l.map(getAndPut))

  def getAndPut(s: String): Future[Boolean] = {
    cache.get(s) flatMap {
      case Some(_) => Future.successful(false)
      case None => cache.put(s)
    }
  }

  def setnx(s: String) = {
    cache.setnx(s).map {
      case true => "set true"
      case false => "already set"
    }
  }
}
