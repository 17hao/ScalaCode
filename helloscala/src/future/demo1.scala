package future

import scala.concurrent.{ExecutionContext, ExecutionContextExecutor, Future}

object demo1 extends App {
  implicit val ec: ExecutionContextExecutor = ExecutionContext.global

  def addTwo(n: Int): Future[Int] = Future {
    n + 2
  }

  def addTwoAndDouble(n: Int): Future[Int] = addTwo(n).map(_ * 2)

  def addTwoAndAddTwo(n: Int) = addTwo(n).map(int => addTwo(int))

  val n = 2

  println(addTwo(n)) //为什么没有这个表达式就不出结果
  addTwo(n).onComplete(println(_))

  addTwoAndDouble(n).onComplete(println(_))

  addTwoAndAddTwo(n).onComplete(println(_))
}
