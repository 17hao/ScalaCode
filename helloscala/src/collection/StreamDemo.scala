package collection

object StreamDemo {
  def main(args: Array[String]): Unit = {
    println(fibFrom(1, 1).take(10).toList)
  }
  // Stream和List类似，但是Stream时无限长度的，只有被处理计算过的元素才会被显示出来
  def fibFrom(a: Int, b: Int): Stream[Int] = a #:: fibFrom(b, a + b)
}