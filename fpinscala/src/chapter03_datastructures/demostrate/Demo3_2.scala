package chapter03_datastructures.demostrate

object Demo3_2 {
  def sum(ints: List[Int]): Int =
    ints match {
      case Nil => 0
      case Cons(head, tail) => head + sum(tail)
    }

  def product(doubles: List[Double]): Double =
    doubles match {
      case Nil => 0.0
      case Cons(head, tail) => head * product(tail)
    }

  /**
    * Extract public part of def sum and def product
    *
    * @param ls list
    * @param b  base value
    * @param f  how to treat local variable
    * @tparam A local variable
    * @tparam B local variable
    * @return
    */
  def foldRight[A, B](ls: List[A], b: B)(f: (A, B) => B): B =
    ls match {
      case Nil => b
      case Cons(x, xs) => f(x, foldRight(xs, b)(f))
    }

  def sumV2(xs: List[Int]): Int = {
    foldRight(xs, 0)((x, y) => x + y)
  }

  def productV2(xs: List[Double]): Double = {
    foldRight(xs, 1.0)((x, y) => x * y)
  }

  def main(args: Array[String]): Unit = {
    val i = List(1, 2, 3, 4, 5, 6)
    val d = List(1.0, 2.0, 3.0)
    val sumRes = sumV2(i)
    val productRes = productV2(d)
    println(sumRes)
    println(productRes)
  }
}
