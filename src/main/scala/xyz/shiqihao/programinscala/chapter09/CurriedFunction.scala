package xyz.shiqihao.programinscala.chapter09

object CurriedFunction extends App {
  val sum = (x: Int, y: Int) => x + y
  println(sum(1, 2))

  // return a function
  def plainFunction = (x: Int, y: Int) => x + y
  println(plainFunction(1, 2))

  // return type is integer
  def plainSum(x: Int, y: Int) = x + y //good boy
  println(plainSum(1, 2))

  // A curried function is applied to multiple parameter list
  def curriedSum(x: Int)(y: Int) = x + y
  println(curriedSum(1)(2))

  // return a function
  def curriedSumMid(x: Int): Int => Int = (y: Int) => x + y
  println(curriedSumMid(1))
}
