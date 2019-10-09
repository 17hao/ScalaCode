package xyz.shiqihao.misc.fp.hof

object AnonymousFunc extends App {
  def anonymous(a: Int, f: Int => Int): Int = {
    f(a)
  }

  /** Anonymous function 'n => n * 2' */
  println(anonymous(10, n => n * 2))
}
