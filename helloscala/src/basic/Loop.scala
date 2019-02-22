package basic

object Loop {
  def main(args: Array[String]): Unit = {
    val str = "abc"
    var i = 0
    // 用while实现循环，这种方式偏向于命令式编程，一步步告诉该怎么做
    while (i < str.length) {
      println(str(i))
      i += 1
    }
    // 用函数式的方法实现以上功能
    str.foreach(println(_))
  }
}
