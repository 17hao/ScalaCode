package oop.constructor

object PrimaryConstructor {
  def main(args: Array[String]): Unit = {
    val person = new Person("sqh", 22)
    print(person)
  }
}

// 主构造方法就是类名后面的“（）”
class Person(inName: String, inAge: Int) {
  val name: String = inName
  val age: Int = inAge

  override def toString: String = {
    "name: " + this.name + "\tage: " + this.age
  }
}
