package xyz.shiqihao.programinscala.chapter08

object FunctionLiteral extends App {
  /**
   * 'function literal' and 'value'<br/>
   * Function as first-class citizen like string or integer.
   *
   * 函数字面量会被编译成一个类(拓展scala包FunctionN系列trait）的实例
   * 运行时实例化成函数值
   */
  val literal = (x: Int) => x + 1
  println(literal(1))
}
