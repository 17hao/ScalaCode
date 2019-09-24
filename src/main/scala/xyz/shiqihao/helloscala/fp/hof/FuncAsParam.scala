package xyz.shiqihao.helloscala.fp.hof

object FuncAsParam {
  def main(args: Array[String]): Unit = {
    println(hello[String](str => str.reverse, "hello"))
    println(hi("hi"))
  }

  /**
    * Takes a function as parameter
    * anonymous function <=> function literal
    */
  def hello[A](f: A => A, a: A): A = f(a)

  def hi[A](f: => A): A = f
}