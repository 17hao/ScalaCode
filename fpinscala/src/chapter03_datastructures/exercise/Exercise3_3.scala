package chapter03_datastructures.exercise

import chapter03_datastructures.demostrate.{Cons, List}

object Exercise3_3 {
  /**
    * Set a new value for the first element in list
    *
    * @param xs
    * @param h
    * @tparam A
    * @return
    */
  def setHead[A](xs: List[A], h: A): List[A] = xs match {
    case Cons(_, tail) => Cons(h, tail)
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6)
    val h = 100
    val res = setHead(list, h)
    println(res)
  }
}
