package chapter8

object FunctionLiteral extends App {
  /*
    'function literal' and 'value'
    函数式first-class，可以被当做整型、字符串进行运算
    函数字面量会被编译成一个类(拓展scala包FunctionN系列trait）的实例
    运行时实例化成函数值
   */
  val literal = (x: Int) => x + 1
  println(literal(1))
}
