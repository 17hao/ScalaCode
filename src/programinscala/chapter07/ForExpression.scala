package chapter07

object ForExpression {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)
    /*
      for表达式被称为表达式是因为能产生新的值
      for用于遍历集合
      for搭配多种功能（过滤、嵌套循环、生成新的集合）
     */
    def newList = for {
      elem <- list
      if elem % 2 == 0
    } yield elem * 3

    println(newList)
  }
}
