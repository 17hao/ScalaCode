package chapter10

object ElementTest extends App {
  val arrayElement = new ArrayElement(Array("***", "hello"))
  println(arrayElement.length)
  println(arrayElement.contents)
}
