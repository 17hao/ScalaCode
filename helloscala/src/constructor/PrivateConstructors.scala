package constructor

object PrivateConstructors {
  def main(args: Array[String]): Unit = {
    val person3 = new Person3("sqh")
    person3.showInfo()
  }
}

// 主构造器私有化,只能通过辅助构造器创建对象
class Person3 private() {
  var name: String = _

  def this(name: String) {
    this()
    this.name = name
  }

  def showInfo(): Unit = {
    println("name is:" + this.name)
  }
}
