package basic

object VarDemo {
  def main(args: Array[String]): Unit = {
    val num1 = 20
    val num2 = 30
    println(num1 + num2)
    val person = new Person
    println(person.name + " " + person.age)
    person.name = "lyj"
    println(person.name)
    for (i <- 1 to 3) {
      print(person.name)
    }
    print("\n")
    for (i <- 1 until 3) {
      print(person.name)
    }
  }
}

class Person {
  var name = "sqh"
  var age = 22
}
