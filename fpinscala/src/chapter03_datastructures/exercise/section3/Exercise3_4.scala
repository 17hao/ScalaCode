package chapter03_datastructures.exercise.section3

import chapter03_datastructures.demostrate.{Cons, List}

object Exercise3_4 {
  /**
    * Delete the first nth elements.
    *
    * @param l list
    * @param n the nth
    * @tparam A type parameter
    */
  def drop[A](l: List[A], n: Int): List[A] = {
    if (n > 0) {
      l match {
        case Cons(_, tail) => drop(tail, n - 1)
      }
    } else {
      l
    }
  }

  def main(args: Array[String]): Unit = {
    val l = List(1)
    val res = drop(l, 1)
    println(res)
  }
}
