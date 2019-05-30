package fp

object PartialFunc {
  def main(args: Array[String]): Unit = {
    // 局部函数
    val handle1to6 = convert1to3 orElse convert4to6
    println(handle1to6(1))
    println(handle1to6(5))
  }

  val convert1to3: PartialFunction[Int, String] = new PartialFunction[Int, String] {
    val nums = Array("one", "two", "three")

    def apply(i: Int): String = nums(i - 1)

    override def isDefinedAt(x: Int): Boolean = x > 0 && x < 3
  }

  val convert4to6: PartialFunction[Int, String] = new PartialFunction[Int, String] {
    val nums = Array("four", "five", "six")

    def apply(i: Int): String = nums(i - 4)

    override def isDefinedAt(x: Int): Boolean = x > 3 && x < 7
  }
}
