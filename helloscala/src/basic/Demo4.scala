package basic

object Demo4 {
  def main(args: Array[String]): Unit = {
    // :: 读作 cons x :: xs x是一个元素 xs是一个列表
    val list = 1 :: Nil
    val list2 = 2 :: list
    println(list)
    println(list2)
  }
}
