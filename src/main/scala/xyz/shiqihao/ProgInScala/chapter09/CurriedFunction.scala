package xyz.shiqihao.ProgInScala.chapter09

object CurriedFunction extends App {
  // an expression
  val sum = (x: Int, y: Int) => x + y
  println(sum(1, 2))

  // 返回类型是函数
  def plainFunction = (x: Int, y: Int) => x + y
  println(plainFunction(1, 2))

  // 返回类型是integer
  def plainSum(x: Int, y: Int) = x + y //good boy
  println(plainSum(1, 2))

  // a curried function
  def curriedSum(x: Int)(y: Int) = x + y
  /*
    函数柯里化允许函数有多个参数列表
    实现过程可以具象为先调用一次函数curriedSum(1)_,在调用一次函数
   */
  println(curriedSum(1)(2))

  // 返回类型是函数
  def curriedMiddle(x: Int): Int => Int = (y: Int) => x + y
  println(curriedMiddle(1))
}
