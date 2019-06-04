package oop.companion

class Pig(pName: String) {
  val name: String = pName

  override def toString: String = {
    "猪的名字是：" + this.name
  }
}

object Pig {
  def apply(pName: String): Pig = new Pig(pName)

  def apply(): Pig = new Pig("匿名猪猪")
}

object ApplyDemo extends App {
  /** 调用伴生类的主构造器创建对象 */
  val pig1 = new Pig("lyj")
  println(pig1)

  /** 调用伴生对象的apply方法创建对象 */
  val pig2 = Pig() // 调用apply()
  println(pig2)
  val pig3 = Pig("lyj") // 调用apply(pName)
  print(pig3)
}
