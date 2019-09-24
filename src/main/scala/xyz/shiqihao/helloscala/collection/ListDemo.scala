package xyz.shiqihao.helloscala.collection

object ListDemo extends App {
  /**
    * :: pronounce cons
    * the expression x :: xs  x is an element, xs is a list
    */
  val list = 1 :: Nil
  val list2 = 2 :: list
  println(list)
  println(list2)
}
