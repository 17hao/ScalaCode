package chapter02.exercise

object Exercise01 extends App {
  /**
    * Get the nth Fibonacci number
    * The first Fibonacci numbers are 0 and 1
    *
    * @param n
    * @return
    */
  def fib(n: Int): Int = {
    def go(n: Int, pre1: Int, pre2: Int): Int = {
      if (n == 1)
        pre1
      else if (n == 2)
        pre2
      else
        go(n - 1, pre2, pre1 + pre2)
    }

    go(n, 0, 1)
  }

  println(fib(4))
}
