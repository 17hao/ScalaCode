package chapter06

object Demo {
  def main(args: Array[String]): Unit = {
    val num1 = new Rational(1, 4)
    val num2 = new Rational(1, 4)
    val num3 = new Rational(1, 4)
    val sum = num1 + num2 + num3
    println(sum)
    println(num1 * 10)
    println(num1 + 10)
    val product = num1 * num2 + num3
    println(product)
  }
}
