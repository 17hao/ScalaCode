package constructor

object OopDemo {
  def main(args: Array[String]): Unit = {
    val person = new Person("s", 22)
    print(person)
  }
}

class Person(inName: String, inAge: Int) {
  var name: String = inName
  var age: Int = inAge

  override def toString: String = {
    "name: " + this.name + "age: " + this.age
  }
}
