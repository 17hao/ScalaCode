package fpinscala.chapter02_gettingstarted.exercise

object Exercise2_3 {
  /**
    * Currying
    * Transfer a function with two arguments to a partial function with one argument
    *
    * @param f
    * @tparam A
    * @tparam B
    * @tparam C
    * @return
    */
  def curry[A, B, C](f: (A, B) => C): A => B => C = {
    a => b => f(a, b)
  }
}
