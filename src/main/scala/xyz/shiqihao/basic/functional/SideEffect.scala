package xyz.shiqihao.basic.functional

object SideEffect {
  def main(args: Array[String]): Unit = {
    val list = List("one", "two", "three")
    printSomething(list)
    print(printSomethingFunctional(list))
  }

  // 函数式编程的风格是没有副作用
  // 副作用就是返回类型是Unit
  // 返回类型是Unit意味着要输出或者带来一些其他的副作用
  def printSomething(list: List[String]) = {
    list.foreach(println)
  }

  // 没有副作用的函数式风格
  // 只产生一个返回值
  // 通过函数的调用实现功能
  def printSomethingFunctional(list: List[String]) = {
    list.mkString("\n")
  }
}
