package oop.casekeyword

class Person(n: String, a: Int) {
  private val name = n

  def getName: String = name

  def apply(name: String, age: Int): Person = new Person(name, age)
}

case class Employee(n: String, a: Int) extends Person(n: String, a: Int) {
  private val age = a

  def getAge: Int = age
}

object Test {
  def main(args: Array[String]): Unit = {
    val person = new Person("sqh", 22)
    println(person.getName)

    val employee = Employee("lyj", 22)
    println(employee.getAge)
  }
}