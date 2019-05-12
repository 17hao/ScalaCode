package future

import scala.concurrent.{ExecutionContext, Future}

object demo1 extends App {
  implicit val ec = ExecutionContext.global

  def addTwo(n: Int): Future[Int] = {
    Future(n + 2)
  }

  def addTwoAndDouble(n: Int) = addTwo(n).map(_ * 2)

  def addTwoAndAddTwo(n: Int) = addTwo(n).map(addTwo(_))

  val n = 2
  addTwo(n).onComplete(println(_))

  addTwoAndDouble(n).onComplete(println(_))

  addTwoAndAddTwo(n).onComplete(println(_))
}
