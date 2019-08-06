package implicitt

object ImplicitFunc {
  def main(args: Array[String]): Unit = {
    val n = 10
    out(n)
  }

  // 编译器在需要的时候自动调用这些隐式方法完成类型转换
  implicit def transfer(a: Int): String = {
    println(a)
    println(a.getClass)
    a.toString
  }

  def out(b: String): Unit = {
    println(b)
  }
}
