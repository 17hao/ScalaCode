package xyz.shiqihao.basic.oop.companion

// 伴生类
class Employee(inName: String, inAge: Int) {
  val name: String = inName
  val age: Int = inAge
}

// 伴生对象
object Employee {
  val department: String = "IT"

  def showInfo(): Unit = {
    println(this.department)
  }
}

object CompanionDemo extends App {
  val sqh = new Employee("sqh", 22)
  /** 伴生对象里的方法可以直接通过对象名调用 */
  Employee.showInfo()
  print(sqh)

}

