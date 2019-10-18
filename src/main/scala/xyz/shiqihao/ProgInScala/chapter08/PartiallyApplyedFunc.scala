package xyz.shiqihao.ProgInScala.chapter08

object PartiallyApplyedFunc {
  def main(args: Array[String]): Unit = {
    /*
      函数（一种映射关系）作用到了参数上，返回了相应的映射结果
      部分应用函数中
      函数字面量被编译成不同的类(拓展scala包FunctionN系列trait）的实例
     */
    val a = sum _
    val b = sum(1, _: Int, 2)
    println(a(1, 2, 3))
    println(b(2))
  }

  def sum(a: Int, b: Int, c: Int): Int = {
    a + b + c
  }
}
