package chapter03_datastructures.demostrate

sealed trait List[+A]

case object Nil extends List[Nothing]

case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {
  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Cons(x, xs) => x + sum(xs)
  }

  def product(ints: List[Double]): Double = ints match {
    case Nil => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x, xs) => x * product(xs)
  }

  /* variadic function */
  def apply[A](as: A*): List[A] = {
    if (as.isEmpty) Nil
    /* `_*` tells the compiler to treat a single argument of a sequence type */
    else Cons(as.head, apply(as.tail: _*))
  }
}