package chapter02_gettingstarted.demonstrate

/**
  * Adapt our program to print both the absolute value of a number
  * and the factorial of another number
  */
object Demo2_1 extends App {
  /**
    * Calculate the absolute value of a number
    *
    * @param n target value
    * @return
    */
  def abs(n: Int): Int = {
    if (n >= 0) n
    else -n
  }

  /**
    * Calculate the factorial of a number
    *
    * @param n the nth number
    * @return
    */
  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int = {
      if (n == 1) acc
      else go(n - 1, acc * n)
    }

    go(n, 1)
  }

  /**
    * Format the result of abs() and factorial() or other function
    *
    * @param name behavior
    * @param n    parameter
    * @param f    function
    * @return
    */
  private def formatResult(name: String, n: Int, f: Int => Int): String = {
    val msg = "The %s of %d is %d"
    msg.format(name, n, f(n))
  }

  println(formatResult("absolute", -100, abs))
  println(formatResult("factorial", 7, factorial))

  /* pass a anonymous function as argument*/
  println(formatResult("increment", 10, _ + 1))
}
