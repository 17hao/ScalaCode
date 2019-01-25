package basic

// 函数可以作为变量传递
object Demo {
  def main(args: Array[String]): Unit = {
    oncePerSecond(timeFlies)
  }

  def oncePerSecond(callback: () => Unit): Unit = {
    while (true) {
      callback()
      Thread sleep (1000)
    }
  }

  def timeFlies(): Unit = {
    println("time flies like an arrow..")
  }
}
