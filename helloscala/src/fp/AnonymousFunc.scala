package fp

object AnonymousFunc {
  // 函数(方法）可以作为变量传递
  def main(args: Array[String]): Unit = {
    oncePerSecond(println("anonymous->time flies like an arrow..."))
    oncePerSecond(timeFlies)
  }

  def oncePerSecond(callback: => Unit): Unit = {
    for (_ <- 1 to 3) {
      callback
    }
  }

  def timeFlies(): Unit = {
    println("time flies like an arrow..")
  }
}
