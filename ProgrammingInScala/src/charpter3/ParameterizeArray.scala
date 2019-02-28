package charpter3

object ParameterizeArray {
  def main(args: Array[String]): Unit = {
    val greetingStrings = Array("sqh", "lyj")
    greetingStrings.foreach(str => print(str + " "))
    println()
    /*
    此例展示了Scala中2个重要的概念
    ①Scala中val修饰的变量不能被赋其他值，但是Array中的元素可以被改变,数组本身是可变的
    ②和Java不同的是Scala中Array选取数组元素用的是()而不是[]，
      这相当于是调用了Array的apply方法，等同于Array.update(0,"SQH")
     */
    greetingStrings(0) = "SQH"
    greetingStrings.foreach(str => print(str + " "))
  }
}
