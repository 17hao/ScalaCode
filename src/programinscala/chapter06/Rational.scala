package chapter06

/*
  一个有理数类
  @author 17hao
  @date 2019/3/1
 */
class Rational(n: Int, d: Int) {
  require(d != 0) // ①确保分母不为0
  private val g = gcd(n.abs, d.abs) // ②分子分母可以约分
  private val numerator: Int = n / g // 分子
  private val denominator: Int = d / g // 分母

  // ③辅助构造方法，例如5/1可以简化成5
  // Rational的辅助构造方法只是调用下主构造方法
  // Scala中类的辅助构造方法要吗调用主构造方法，要吗调用其他辅助构造方法
  // 所以主构造方法是类的唯一入口
  def this(n: Int) = this(n, 1)

  override def toString: String = numerator + "/" + denominator // ④重写toString方法

  def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b) // scala中优先使用尾递归
  }

  def +(n: Int): Rational = {
    new Rational(
      numerator + n * denominator,
      denominator
    )
  }

  def +(rational: Rational): Rational = {
    new Rational(
      numerator * rational.denominator + rational.numerator * denominator,
      denominator * rational.denominator
    )
  }

  def *(n: Int): Rational = {
    new Rational(
      numerator * n,
      denominator
    )
  }

  def *(rational: Rational): Rational = {
    new Rational(
      numerator * rational.numerator,
      denominator * rational.denominator
    )
  }
}
