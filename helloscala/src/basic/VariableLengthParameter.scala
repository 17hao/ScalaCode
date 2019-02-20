package basic

object VariableLengthParameter {
  // 可变长参数列表
  def main(args: Array[String]): Unit = {
    val res = sum(1, 2, 3, 4, 5)
    println(res)
    val res_ = sum(1 to 5: _*)
    println(res_)
  }

  def sum(args: Int*) = {
    var res = 0
    for (arg <- args) yield res += arg
    res
  }
}
