package future

import scala.concurrent.{ExecutionContext, ExecutionContextExecutor, Future}
import scala.util.{Failure, Success}

object demo1 extends App {
  implicit val ec: ExecutionContextExecutor = ExecutionContext.global

  def addTwo(n: Int): Future[Int] = Future(n + 2)

  def addTwoAndDouble(n: Int) = addTwo(n).map(_ * 2)

  def addTwoAndAddTwo(n: Int) = addTwo(n).flatMap(addTwo)

  val n = 2
  addTwo(n).onComplete {
    case Success(result) => println(result)
    case Failure(exception) => println(exception)
  }

  addTwoAndDouble(n).onComplete {
    case Success(result) => println(result)
    case Failure(exception) => println(exception)
  }

  addTwoAndAddTwo(n).onComplete {
    case Success(result) => println(result)
    case Failure(exception) => println(exception.toString)
  }
}
