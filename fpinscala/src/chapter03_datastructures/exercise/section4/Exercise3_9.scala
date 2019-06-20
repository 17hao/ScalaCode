package chapter03_datastructures.exercise.section4

import chapter03_datastructures.demostrate.{Cons, List, Nil}

object Exercise3_9 {
  def foldRight[A, B](ls: List[A], b: B)(f: (A, B) => B): B =
    ls match {
      case Nil => b
      case Cons(x, xs) => f(x, foldRight(xs, b)(f))
    }

  def length[A](xs: List[A]): Int = {
    foldRight(xs, 0)((_, y) => y + 1)
  }

  def main(args: Array[String]): Unit = {
    val l = List(1, 2, 3, 4, 5)
    val res = length(l)
    println(res)
  }
}
