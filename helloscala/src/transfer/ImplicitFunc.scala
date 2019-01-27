package transfer

object ImplicitFunc {
  def main(args: Array[String]): Unit = {
    // 隐式转换函数 double->int
    implicit def transfer(d: Double): Int = {
      d.toInt
    }

    val num: Int = 3.5
    println(num)
  }
}
