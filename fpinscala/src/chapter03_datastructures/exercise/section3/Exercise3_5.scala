package chapter03_datastructures.exercise.section3

import chapter03_datastructures.demostrate.{Cons, List, Nil}

object Exercise3_5 {
  /**
    * Delete the elements meet the requirement
    *
    * @param l list
    * @param f requirement
    * @tparam A type parameter
    */
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] =
    l match {
      case Nil => Nil
      case Cons(head, tail) =>
        if (f(head))
          dropWhile(tail, f)
        else
          Cons(head, dropWhile(tail, f))
    }

  private def f[A](a: A) = {
    a == 10
  }

  def main(args: Array[String]): Unit = {
    val l = List(1, 10, 3, 4, 5, 6, 7, 10)
    val res = dropWhile(l, f)
    val resV2 = dropWhile[Int](l, a => a != 10)
    println(res)
    println(resV2)
  }
}
