package collection

/**
 * @author 17hao
 * @since 2019/4/10
 */
object FlatMap2 extends App {
  val list = List("string")
  val res = list.flatMap(char => char.map(_.toInt))
  println(res)
}
