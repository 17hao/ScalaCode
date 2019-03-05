package chapter10

object ElementTest extends App {
  val arrayElement = new ArrayElement(Array("***hello", "hello***"))
  println(arrayElement.width)
  println(arrayElement)
}
