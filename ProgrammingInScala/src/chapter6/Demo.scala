package chapter6

object Demo {
  def main(args: Array[String]): Unit = {
    val num1 = new Rational(1, 4)
    val num2 = new Rational(1, 4)
    val num3 = new Rational(1, 4)
    val sum = num1 + num2 + num3
    println(sum)
    val product = num1 * num2 + num3
    println(product)
  }
}
