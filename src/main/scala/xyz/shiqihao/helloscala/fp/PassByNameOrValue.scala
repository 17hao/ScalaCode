package xyz.shiqihao.helloscala.fp

object PassByNameOrValue {
  def main(args: Array[String]): Unit = {
    passByValue(doSomething())
    println("##########")
    passByName(doSomething())
  }

  def doSomething(): Int = {
    println("do something")
    1
  }

  /**
    *
    * @param x just an Integer
    */
  def passByValue(x: Int): Unit = {
    println("the value is: " + x)
    println("the value is: " + x)
  }

  /**
    *
    * @param x a function of no argument that will generate an Integer
    */
  def passByName(x: => Int): Unit = {
    println("the value is: " + x)
    println("the value is: " + x)
  }
}
