package collection

/**
 * @author 17hao
 * @date 2019-4-10
 */
object FlatMap2 extends App {
  val list = List("flat", "map")
  val listV2 = Map(Map(3 -> 4) -> Map(1 -> 2))
  val listV2_1 = listV2.flatten(_._1)
  println(listV2_1)
  val listTmp = list.flatten
  println(listTmp)
  val res = list.flatMap(str => str.map(_.toInt))
  val resV2 = list.flatMap(list => list.split("t"))
  val xs = Map("a" -> List(111, 111), "b" -> List(222, 222)).flatMap(_._2)
  val xsTmp = Map("a" -> List(111, 111), "b" -> List(222, 222)).flatten(_._2)
  val ys = Map(List(1) -> List(2), List("a") -> List(4)).flatten(_._1)
  val zs = Map("a" -> List(1 -> 2), "b" -> List(3 -> 4)).flatMap(_._2)
  println(res)
  println(resV2)
  println(xs) //List(111, 111, 222, 222)
  println(xsTmp)
  println(ys)
  println(zs)

  val s = Seq("string", "map")
  val sf = s.flatMap { str =>
    if (str == "string")
      str.split("r")
    else
      str.split("a")
  }
  println(sf)
}
