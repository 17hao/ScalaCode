package functional

object ExecFuction { // 接受一个函数作为参数
  def main(args: Array[String]): Unit = {
    execFunction(printName)
  }

  def execFunction(f: String => Unit): Unit = {
    f("sqh")
  }

  def printName(name: String): Unit = {
    println("hello: " + name)
  }
}
