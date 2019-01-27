package functional

// 函数可以作为变量传递
object AnonymousFunc {
  def main(args: Array[String]): Unit = {
    oncePerSecond(() => println("anonymous->time flies like an arrow..."))
    oncePerSecond(timeFlies)
  }

  def oncePerSecond(callback: () => Unit): Unit = {
    for (i <- 1 to 3) {
      callback()
    }
  }

  def timeFlies(): Unit = {
    println("time flies like an arrow..")
  }
}
