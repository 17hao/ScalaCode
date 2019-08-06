package future

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object UseOfFuture extends App {
  /**
    * Create a new future by applying the successful result of this future
    * and returns the result of the function as the new future
    */
  val flatMap = Future(1 + 1).flatMap(i => Future(i * 2))
  println(flatMap.value)

  /**
    * Use of Future.traverse
    * Transforming a TraversableOnce[A] into a `Future[TraversableOnce[B]]` using
    * the provided function A => Future[B]
    */
  val traversed = Future.traverse(List(1, 2, 3))(i => Future(i))
  println(traversed)

  /**
    * Use of Future.sequence
    * Transforming a `Future[Traversable[A]]` into a `Traversable[Future[A]]`
    */
  val futureList = Future.sequence(List(Future(1), Future(2), Future(3)))
  println(futureList)
}
