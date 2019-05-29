package chapter02_gettingstarted.exercise

object Exercise2_4 {
  /**
    * uncurry
    *
    * @param f
    * @tparam A
    * @tparam B
    * @tparam C
    * @return
    */
  def uncurry[A, B, C](f: A => B => C): (A, B) => C = {
    (a: A, b: B) => f(a)(b)
  }
}
