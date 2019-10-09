package xyz.shiqihao.misc.implicitt

object ImplicitParameter {
  def main(args: Array[String]): Unit = {
    val a = 1
    val b = 2
    val c = 3
    implicit val d: Int = 4
    calculate(a, b)
  }

  // 参数用implicit关键字修饰，调用时寻找implicit修饰的变量
  def calculate(a: Int, b: Int)(implicit c: Int): Unit = {
    println(a + b + c)
  }
}

