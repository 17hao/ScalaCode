package fp

object closure {
  // 函数闭包的一个简单例子
  def main(args: Array[String]): Unit = {
    val more = 10
    val add = (x: Int) => x + more
    println(add(10))
  }
}
