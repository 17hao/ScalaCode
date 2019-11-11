package xyz.shiqihao.basic.oop

object TraitInstance extends App {
  val instance = new t {} // Creating an anonymous class
  print(instance.func(1, 2))
}

trait t {
  def func(a: Int, b: Int): Int = {
    a + b
  }

  //def abstractFunc(a: Int, b: Int): Int
}
