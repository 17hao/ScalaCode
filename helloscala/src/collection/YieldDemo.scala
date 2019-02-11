package collection

object YieldDemo {
  def main(args: Array[String]): Unit = {
    val a = Array(1, 2, 3, 4)

    // foreach接受一个函数作为参数
    // 接受的函数就是你想要对这个集合每个元素做的映射
    a.foreach(i => print(i + " "))

    // for+yield也可以实现类似的功能
    // val a2 = for(e <- a) yield e
    val a2 = for (e <- a) yield print(e)
    // a2.foreach(i => print(i+" "))
    print("\n")

    // yield可以改变集合中的元素
    val a3 = for (e <- a) yield e * 2
    a3.foreach(i => print(i + " "))
    println()

    // 用if实现循环守卫，过滤元素
    val a4 = for (e <- a if e < 4) yield e * 3
    a4.foreach(i => print(i + " "))
  }
}
