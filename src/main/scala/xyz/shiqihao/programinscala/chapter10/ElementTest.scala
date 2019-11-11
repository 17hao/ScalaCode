package xyz.shiqihao.programinscala.chapter10

object ElementTest extends App {
  val arrayElement1 = new ArrayElement(Array("***hello", "hello***"))
  println(arrayElement1.width)
  println(arrayElement1)
  val arrayElement2 = new ArrayElement(Array("***world", "***world"))
  println(arrayElement2)
  println(arrayElement1 above arrayElement2)
  println(arrayElement1 beside arrayElement2)
  val lineElement = new LineElement("sqh")
  println(lineElement)
  val uniformElement = new UniformElement('a', 2, 3)
  println(uniformElement)
}
