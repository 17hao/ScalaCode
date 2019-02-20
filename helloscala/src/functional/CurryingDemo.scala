package functional

object CurryingDemo {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5)
    // 多个参数列表，调用函数时使用了较少的参数时，自动将缺失的作为参数
    val res = numbers.foldLeft(0)((m, n) => m + n)
    // 使用类型推断，使代码更简洁
    val res_ = numbers.foldLeft(1)(_ * _)
    println(res)
    println(res_)
  }
}
