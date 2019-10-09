package xyz.shiqihao.misc.basic

object LoopDemo extends App {
  val str = "hello, world!"
  for (i <- 0 until str.length) {
    print(str(i))
  }

  1 until str.length foreach(_ => print(str))
}
