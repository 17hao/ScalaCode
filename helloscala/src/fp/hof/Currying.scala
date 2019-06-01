package fp.hof

object Currying extends App {
  def curry[A](a: A)(f: A => A): A = f(a)

  /** Generate a temp function */
  println(curry(4)(_))

  /** Pass a function to the higher order function */
  println(curry(4)(i => i * 2))

  /** output: hello, sqh */
  println(curry("sqh")(i => "hello, " + i))
}
