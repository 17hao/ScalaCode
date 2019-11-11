package xyz.shiqihao.basic.oop.constructor

object AuxiliaryConstructor {
  def main(args: Array[String]): Unit = {
    val person2 = new Person2("lyj")
    person2.age = 22
    person2.showInfo()
  }
}

class Person2() {
  var name: String = _
  var age: Int = _

  // 辅助构造方法,名字就是this
  def this(name: String) {
    this() // 辅助构造器必须先调用主构造器
    this.name = name
  }

  // 辅助构造器2
  def this(name: String, age: Int) {
    this()
    this.name = name
    this.age = age
  }

  // 辅助构造器3
  def this(age: Int) {
    this("匿名") // 调用了前一个辅助构造器，这里间接的还是调用了主构造器this
    this.age = age
  }

  def showInfo(): Unit = {
    println("name is: " + this.name)
    println("age is:" + this.age)
  }
}
