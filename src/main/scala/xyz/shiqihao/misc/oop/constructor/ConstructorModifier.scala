package xyz.shiqihao.misc.oop.constructor

object ConstructorModifier {
  def main(args: Array[String]): Unit = {
    val worker = new Worker("smith")
    println(worker)
    val worker2 = new Worker2("jack")
    println(worker2)
    println(worker2.name)
    val worker3 = new Worker3("marry")
    println(worker3)
    worker3.name = "john"
    println(worker3.name)
  }
}

// name是局部变量
class Worker(inName: String) {
  var name: String = inName

  override def toString: String = {
    "name1: " + this.name
  }
}

// inName用val修饰，意味着inName是只读的属性
class Worker2(val inName: String) {
  var name: String = inName

  override def toString: String = {
    "name2: " + this.name
  }
}

// inName用var修饰，意味着inName是可读可写的属性
class Worker3(var inName: String) {
  var name: String = inName

  override def toString: String = {
    "name3: " + this.name
  }
}