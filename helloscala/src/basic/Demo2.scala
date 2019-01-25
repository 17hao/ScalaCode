package basic

object Demo2 {
  def main(args: Array[String]): Unit = {
    oncePerSecond(() => println("time flies like an arrow..."))
  }

  def oncePerSecond(callback: () => Unit): Unit = {
    while (true) {
      callback()
      Thread sleep (1000)
    }
  }
}
