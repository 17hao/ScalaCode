package accompany

object Demo2 {
  def main(args: Array[String]): Unit = {
    // 调用伴生类的主构造器创建对象
    val pig1 = new Pig("lyj")
    println(pig1)

    // 调用伴生对象的aply方法创建对象
    val pig2 = Pig() // 调用aply()
    println(pig2)
    val pig3 = Pig("lyj") // 调用aply(pName)
    print(pig3)
  }
}

class Pig(pName: String) {
  val name = pName

  override def toString: String = {
    "猪的名字是：" + this.name
  }
}

object Pig {
  def apply(pName: String): Pig = new Pig(pName)

  def apply(): Pig = new Pig("匿名猪猪")
}


