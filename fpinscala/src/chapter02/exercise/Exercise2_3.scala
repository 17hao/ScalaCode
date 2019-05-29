package chapter02.exercise

object Exercise2_3 {
  /**
    * Transfer a function with two arguments to a partial function with one argument
    *
    * @param f
    * @tparam A
    * @tparam B
    * @tparam C
    * @return
    */
  def curry[A, B, C](f: (A, B) => C): A => B => C = {
    a: A => b: B => f(a, b)
  }
}
