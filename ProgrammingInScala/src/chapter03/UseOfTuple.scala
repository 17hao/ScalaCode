package chapter03

object UseOfTuple {
  def main(args: Array[String]): Unit = {
    val tuple = (1, "two", 3.0)
    println(tuple)
    /*
      获取元组中的元素用'._x',x从1开始
      因为元组可以存放不同类型的数据
      来自其他语言的传统，如Haskell、ML
    */
    println(tuple._1)
  }
}
