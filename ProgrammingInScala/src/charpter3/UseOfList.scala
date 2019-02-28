package charpter3

object UseOfList {
  def main(args: Array[String]): Unit = {
    val twoThree = List(2, 3)
    /*
      Scala中List和Java最大的不同在于Scala的List是不可变的
      :: 是常用的添加List元素的方法，通常方法都是左操作元(left operand)，例如a*b，*是a的方法
      但是Scala中以:结尾的方法都是右操作元(right operand)，即::是twoThree的方法
     */
    val onetwoThree = 1 :: twoThree
    print(onetwoThree + "\n")
    // 另一种创建List的方法，Nil代表空
    val list = 1 :: 2 :: 3 :: Nil
    println(list)
  }
}
