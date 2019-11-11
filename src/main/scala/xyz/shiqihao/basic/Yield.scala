package xyz.shiqihao.basic

object Yield {
  def main(args: Array[String]): Unit = {
    // for comprehension
    // yield生成的集合和第一个生成器类型兼容
    val res = for (ch <- "hello"; n <- 0 to 1) yield (ch + n).toChar
    println(res) // hieflmlmop
    // 执行步骤：
    // 0依次和hello每个字符匹配
    // val res_ = for (n <- 0 to 1; ch <- "hello") yield (n + ch).toChar
    // 使用for comprehension时以上是不好的代码风格，以下是好的风格
    val resAnother = for {
      n <- 0 to 1
      ch <- "hello"
    } yield (n + ch).toChar
    println(resAnother) // Vector(h, e, l, l, o, i, f, m, m, p)
    // 没有yield 时好的代码风格
    for (n <- 0 to 1; ch <- "hello")
      println(n, ch)
  }
}
