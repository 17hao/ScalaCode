package collection

object StreamDemo {
  def main(args: Array[String]): Unit = {
    println(fibFrom(1, 1).take(10).toList)
  }

  def fibFrom(a: Int, b: Int): Stream[Int] = a #:: fibFrom(b, a + b)
}
