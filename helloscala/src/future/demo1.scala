package future

import scala.concurrent.{ExecutionContext, ExecutionContextExecutor, Future}

/**
 * @author Shi Qihao
 * @date 2019-05-10 19:20
 */
object Demo1 extends App {
  implicit val ec: ExecutionContextExecutor = ExecutionContext.global

  def addTwo(n: Int): Future[Int] = Future {
    n + 2
  }

  def addTwoAndDouble(n: Int): Future[Int] = addTwo(n).map(i => i * 2)

  def addTwoAndAddTwo(n: Int) = addTwo(n).map(i => addTwo(i))

  val n = 2
  println(addTwo(n))
  addTwo(n).onComplete(println(_))
  println(addTwoAndDouble(n))
  addTwoAndDouble(n).onComplete(println(_))
  println(addTwoAndAddTwo(n))
  addTwoAndAddTwo(n).onComplete(println(_))
}
