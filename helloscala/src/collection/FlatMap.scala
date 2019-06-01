package collection

/**
  * @author 17hao
  * @date 2019-4-10
  */
case class FlatMap(id: Int, attr: String)

object FlatMap extends App {
  val list = List("one", "two")

  /** output: Seq("one, "two") */
  list.flatMap(str => Seq(str)).foreach(println(_))

  /** str.toSeq: String => Seq[Char]
    * Seq("o", "n", "e", "t", "w", "o")
    * output: onetwo
    */
  list.flatMap(str => str.toSeq).foreach(print)

  println("\n#############")

  val map = Map(1 -> "one", 2 -> "two")

  /** Each element in Map is a tuple
    * output: (1,one)(2,two)
    */
  map.flatMap(e => Seq(e)).foreach(print)

  /** output: onetwo */
  map.flatMap(e => e._2).foreach(print)

  println("\n############")

  val m = FlatMap(1, "one")
  val n = FlatMap(2, "two")

  val lm = Map(1 -> List(m, "right1"), 2 -> List(n, "right2"))

  /** output: left1right1left2right2 */
  lm.flatMap(e => e._2).foreach(print)
}
