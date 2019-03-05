package chapter10

object ElementTest extends App {
  val arrayElement = new ArrayElement(Array("***hello", "hello***"))
  println(arrayElement.width)
  println(arrayElement)
  val lineElement = new LineElement("sqh")
  println(lineElement)
  val uniformElement = new UniformElement('a', 2, 3)
  println(uniformElement)
}
