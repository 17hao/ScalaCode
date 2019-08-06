package collection

/**
  * @author 17hao
  * @date 2019-4-10
  */
case class FlatMap(id: Int, attr: String)

object FlatMap extends App {
  val list = List("one", "two")

  /** output: Seq("one, "two") */
  println(list.flatMap(str => Seq(str)))

  /** str.toSeq: String => Seq[Char]
    * Seq("o", "n", "e", "t", "w", "o")
    * output: onetwo
    */
  print(list.flatMap(str => str.toSeq))

  println("\n#############")

  val map = Map(1 -> "one", 2 -> "two")

  /** Each element in Map is a tuple
    * output: (1,one)(2,two)
    */
  println(map.flatMap(e => Seq(e)))

  /** output: onetwo */
  print(map.flatMap(e => e._2))

  println("\n############")

  val m = FlatMap(1, "one")
  val n = FlatMap(2, "two")

  val lm = Map(1 -> List(m, "right1"), 2 -> List(n, "right2"))

  /** output: left1right1left2right2 */
  print(lm.flatMap(e => e._2))
}
