package oop.casekeyword

class Person(val name: String, age: Int)

object Person {
  /** apply method in comparision object simplify the procedure l */
  def apply(name: String, age: Int): Person = new Person(name, age)
}

case class Employee(override val name: String, age: Int, h: Int) extends Person(name, age)

case object Employee {
  val name = "e"
  val age = 22
}

object Test {
  def main(args: Array[String]): Unit = {
    val person = Person("sqh", 22)
    println(person.name)

    val employee = Employee("lyj", 22, 160)
    println(employee.age)

    println(Employee.name + " " + Employee.age + " " + employee.h)
  }
}