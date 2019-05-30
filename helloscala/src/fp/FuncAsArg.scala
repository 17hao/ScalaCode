package fp

object FuncAsArg {
  // 接受函数作(方法）为参数
  def main(args: Array[String]): Unit = {
    execFunction(printName)
    println(hello("hello"))
  }

  // 并不是纯粹的函数式风格
  def execFunction(f: String => Unit): Unit = {
    f("sqh")
  }

  def printName(name: String): Unit = {
    println("hello: " + name)
  }

  // 接受函数（方法）作为参数意味着（基本上）函数是匿名的
  def hello(f: => String) = {
    f + "sqh"
  }
}