package oop.caseclass

object caseClassDemo1 {
  def main(args: Array[String]): Unit = {
    val person = new Person("sqh",22)
    print(person+person.name)
  }
}

case class Person(name:String,age:Int)