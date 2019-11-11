package xyz.shiqihao.programinscala.chapter08

import scala.util.Random

object Closure extends App {
  val more = Random.nextInt(10)

  /**
   * closure
   * Capturing free variable to close function literal.
   */
  def sum: Int => Int = (x: Int) => x + more

  println(more)
  println(sum(10))
}
