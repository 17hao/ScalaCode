//package charpter3

object FunctioalStyle {
  def main(args: Array[String]): Unit = {
    print(formatArg(Array("hello", "sqh")))
  }

  /*
     没有副作用的函数式编程风格
     函数都有返回值，意味着动作靠映射完成,而不是直接
   */
  def formatArg(args: Array[String]) = args.mkString("\n")
}
