package chapter02_gettingstarted.exercise

import scala.annotation.tailrec

object Exercise2_1 extends App {
  /**
    * Get the nth Fibonacci number
    * The first Fibonacci numbers are 0 and 1
    *
    * @param n the nth number
    * @return
    */
  def fib(n: Int): Int = {
    @tailrec
    def loop(pre1: Int, pre2: Int, n: Int): Int = {
      if (n == 1) pre1
      else if (n == 2) pre2
      else loop(pre2, pre1 + pre2, n - 1)
    }

    loop(0, 1, n)
  }

  print(fib(1))
}
