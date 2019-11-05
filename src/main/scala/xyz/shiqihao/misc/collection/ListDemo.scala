package xyz.shiqihao.misc.collection

object ListDemo extends App {
  /**
    * :: pronounce cons
    * the expression x :: xs  x is an element, xs is a list
    */
  val list1 = 1 :: Nil
  val list2 = 2 :: list1
  val list3 = list1 ::: list2
  println(list1)
  println(list2)
  println(list3)
}
