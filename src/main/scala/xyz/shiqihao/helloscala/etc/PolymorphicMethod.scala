package xyz.shiqihao.helloscala.etc

class PolymorphicMethod {
  def method[A](x: A, i: Int): List[A] = {
    if (i <= 0) {
      Nil
    } else {
      List(x)
    }
  }
}

object PolymorphicMethod {
  def static[A](x: A): A = {
    x
  }
}

object Main extends App {
  val p = new PolymorphicMethod
  val r = p.method("a", 1)
  val x = PolymorphicMethod.static("x")
  println(r)
  println(x)
}
