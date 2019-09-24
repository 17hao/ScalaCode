package xyz.shiqihao.fpinscala.chap02_gettingstarted.exercise

object Exercise2_4 {
  /**
    * Uncurry
    *
    * @param f
    * @tparam A
    * @tparam B
    * @tparam C
    * @return
    */
  def uncurry[A, B, C](f: A => B => C): (A, B) => C = {
    (a, b) => f(a)(b)
  }
}
