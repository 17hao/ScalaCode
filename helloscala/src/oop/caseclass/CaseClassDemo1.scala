package oop.caseclass

object CaseClassDemo1 {
  def main(args: Array[String]): Unit = {
    val person = Person("sqh",22)
    print(person+person.name)
  }
}

case class Person(name:String,age:Int)