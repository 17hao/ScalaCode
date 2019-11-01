package xyz.shiqihao.misc.fp.HOF

object Currying extends App {
  /**
    * Currying a function causes the function to change from
    * n parameters to n functions with one parameter
    *
    * In lambda calculation every function has one parameter
    */
  def currying[A, B](f: (A, B) => B): A => B => B = {
    a => b => f(a, b)
  }

  def f(n: Int, s: String): String = {
    s * n
  }

  /** output: hello,hello,hello, */
  println(currying(f)(3)("hello, "))
}
