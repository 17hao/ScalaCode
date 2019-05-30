package chapter03_datastructures.exercise

import chapter03_datastructures.example.{Cons, List}

object Exercise3_2 {
  /**
    * Delete the first element in List
    *
    * @param xs
    */
  def tail[A](xs: List[A]): List[A] = xs match {
    case Cons(_, tail) => tail
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    val res = tail(list)
    println(res)
  }
}
