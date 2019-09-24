package xyz.shiqihao.helloscala.basic

object EqualsDemo extends App {
  val sqh = Employee("sqh", 22)
  println(sqh)
  val lyj = Employee("lyj", 22)
  val fakeLyj = lyj
  println(lyj)
  println(sqh == lyj) // output: false
  println(sqh equals lyj) // output: false
  println(fakeLyj == lyj) // output: true
  println(fakeLyj equals fakeLyj) // output: true
}

case class Employee(name: String, age: Int) {
  override def toString: String = "name: " + name + " age: " + age

  override def hashCode(): Int = super.hashCode()
}
