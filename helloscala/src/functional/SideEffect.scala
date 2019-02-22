package functional

object SideEffect {
  def main(args: Array[String]): Unit = {
    val list = List("one", "two", "three")
    printSomething(list)
    print(printSomething_(list))
  }

  // 函数式编程的风格是没有副作用
  // 副作用就是返回类型是Unit
  def printSomething(list: List[String]) = {
    list.foreach(println)
  }

  // 没有副作用的函数式风格
  // 只产生一个返回值
  // 通过函数的调用实现功能
  def printSomething_(list: List[String]) = {
    list.mkString("\n")
  }
}
