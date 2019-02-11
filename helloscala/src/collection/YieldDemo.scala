package collection

object YieldDemo {
  def main(args: Array[String]): Unit = {
    val a = Array(1, 2, 3, 4)
    // foreach接受一个函数作为参数
    // 接受的函数就是你想要对这个集合每个元素做的映射
    a.foreach(i => print(i + " "))
    println()
    // yield也可以实现类似的功能
    // val a2 = for(e <- a) yield e
    val a2 = for (e <- a) yield print(e)
    // a2.foreach(i => print(i+" "))
    print("\n")
    val a3 = for (e <- a) yield e * 2
    a3.foreach(i => print(i + " "))
  }
}
