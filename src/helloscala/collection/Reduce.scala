package collection

object Reduce extends App {
  val a = Array(1, 2, 3, 4)
  println(a.reduce((x, y) => (x + y) * 2))
}
