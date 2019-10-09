package xyz.shiqihao.misc.fp.closure

object BasicDemo extends App {
  val more = 10

  /**
    * capture the free variable 'more' *
    * if the 'more' change, the closure will seen the change
    */
  val closure = (x: Int) => x + more

  /** closed term */
  val closed = (x: Int) => x + 1

  val capture = closure(10)

  println(capture)
}
