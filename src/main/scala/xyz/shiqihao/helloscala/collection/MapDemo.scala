package xyz.shiqihao.helloscala.collection

object MapDemo extends App {
  /** immutable.Map */
  var map = Map(1 -> "one", 2 -> "two")
  println(map)
  println(System.identityHashCode(map))
  map += (3 -> "three")
  println(map)
  println(System.identityHashCode(map)) // The output is difference from the last call

  println("#######")

  /** mutable.Map */
  val map2 = scala.collection.mutable.Map[String, String]()
  println(System.identityHashCode(map2))
  map2 += ("1" -> "one")
  println(map2)
  println(System.identityHashCode(map2)) // The output is the same as the last call
  map2("1") = "one_"
  println(map2)
  println(System.identityHashCode(map2)) // The output is the same as the last call
}
