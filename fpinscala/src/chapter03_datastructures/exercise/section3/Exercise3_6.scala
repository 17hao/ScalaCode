package chapter03_datastructures.exercise.section3

import chapter03_datastructures.demostrate.{Cons, List, Nil}

object Exercise3_6 {
  def init[A](l: List[A]): List[A] =
    l match {
      case Cons(_, Nil) => Nil
      case Cons(head, tail) => Cons(head, init(tail))
    }

  def main(args: Array[String]): Unit = {
    val l = List(1, 2, 3, 4, 5, 6)
    val res = init(l)
    println(res)
  }
}
