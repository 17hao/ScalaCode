package xyz.shiqihao.basic.collection

/**
  * @author 17hao
  * @date 2019-4-10
  */
case class FlatMap(id: Int, attr: String)

object FlatMap extends App {
  val list = List("one", "two")

  /** output: List("one, "two") */
  println(list.flatMap(Seq(_)))

  /** str.toSeq: String => Seq[Char]
    * output: List(o, n, e, t, w, o)
    */
  print(list.flatMap(_.toSeq))

  println("\n#############")

  val map = Map(1 -> "one", 2 -> "two")

  /** Each element in Map is a tuple
    * output: Map(1 -> one, 2 -> two)
    */
  println(map.flatMap[(Int, String), Map[Int, String]](Seq(_)))

  println(map.map(e => Seq(e)).flatten) // List((1,one), (2,two))

  /** output: List(o, n, e, t, w, o) */
  print(map.flatMap(_._2))

  println("\n############")

  val m = FlatMap(1, "one")
  val n = FlatMap(2, "two")

  val lm = Map(1 -> List(m, "right1"), 2 -> List(n, "right2"))

  /** output: left1right1left2right2 */
  print(lm.flatMap(e => e._2))
}
