package chapter08

import scala.util.Random

object Closure extends App {
  val more = Random.nextInt(10)
  /*
    closure函数的闭包
    闭包名字来源于'通过捕获自由的变量来闭合函数字面量'
   */
  def sum: Int => Int = (x: Int) => x + more

  println(more)
  println(sum(10))
}
