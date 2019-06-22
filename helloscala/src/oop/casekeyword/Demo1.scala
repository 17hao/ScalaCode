package oop.casekeyword

class Person(n: String, a: Int) {
  private val name = n

  def getName: String = name
}

object Person {
  /** apply method in comparision object simplify the procedure l */
  def apply(name: String, age: Int): Person = new Person(name, age)
}

case class Employee(n: String, a: Int) extends Person(n, a) {
  private val age = a

  def getAge: Int = age
}

case object Employee {
  val name = "e"
  val age = 22
}

object Test {
  def main(args: Array[String]): Unit = {
    val person = Person("sqh", 22)
    println(person.getName)

    val employee = Employee("lyj", 22)
    println(employee.getAge)

    println(Employee.name + Employee.age)
  }
}