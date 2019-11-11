package xyz.shiqihao.programinscala.chapter05

object Example {
  def main(args: Array[String]): Unit = {
    val str = "QWER"
    // 调用的方法没有副作用时可以省略方法后面的'()'
    // 如果有副作用就保留'()' eg. println()
    println(str.toLowerCase)
    // 也可以用后缀操作符的方式，即省略'.'
    println(str toLowerCase)
  }
}
