package collection

object YieldDemo2 {
  def main(args: Array[String]): Unit = {
    // for comprehension
    // yield生成的集合和第一个生成器类型兼容
    val res = for (ch <- "hello"; n <- 0 to 1) yield (ch + n).toChar
    println(res) // hieflmlmop
    // 执行步骤：
    // 0依次和hello每个字符匹配
    val res_ = for (n <- 0 to 1; ch <- "hello") yield (n + ch).toChar
    println(res_) // Vector(h, e, l, l, o, i, f, m, m, p)
  }
}
