package helloscala.future

import scala.concurrent.{ExecutionContext, ExecutionContextExecutor, Future}
import scala.util.{Failure, Success}

object BasicDemo extends App {
  implicit val ec: ExecutionContextExecutor = ExecutionContext.global

  def addTwo(n: Int): Future[Int] = Future(n + 2)

  def addTwoAndDouble(n: Int): Future[Int] = addTwo(n).map(_ * 2)

  def addTwoAndAddTwo(n: Int): Future[Int] = addTwo(n).flatMap(addTwo)

  val n = 2

  /** output: 4 */
  addTwo(n).onComplete {
    case Success(result) => println(result)
    case Failure(exception) => println(exception)
  }

  /** output: 8 */
  addTwoAndDouble(n).onComplete {
    case Success(result) => println(result)
    case Failure(exception) => println(exception)
  }

  /** output: 6 */
  addTwoAndAddTwo(n).onComplete {
    case Success(result) => println(result)
    case Failure(exception) => println(exception.toString)
  }
}
