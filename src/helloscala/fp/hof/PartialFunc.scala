package fp.hof

object PartialFunc extends App {
  def partial[A](a: A)(f: A => A): A = f(a)

  /** Generate a temp function */
  println(partial(4)(_))

  /** Pass a function to the higher order function */
  println(partial(4)(i => i * 2))

  /** output: hello, sqh */
  println(partial("sqh")(i => "hello, " + i))
}
