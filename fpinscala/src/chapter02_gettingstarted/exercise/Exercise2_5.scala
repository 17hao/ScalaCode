package chapter02_gettingstarted.exercise

object Exercise2_5 {
  /**
    * Combine 2 functions to 1
    *
    * @param f
    * @param g
    * @tparam A
    * @tparam B
    * @tparam C
    * @return
    */
  def compose[A, B, C](f: B => C, g: A => B): A => C = {
    a => f(g(a))
  }
}
