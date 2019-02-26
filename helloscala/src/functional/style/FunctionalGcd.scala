package functional.style

object FunctionalGcd {
  def main(args: Array[String]): Unit = {
    // 函数式和命令式2中风格实现求最大公约数
    println(gcdLoop(55, 20))
    println(gcd(55, 20))
  }

  // 命令式风格
  def gcdLoop(x: Int, y: Int): Int = {
    var a = x
    var b = y
    while (a != 0) {
      var temp = a
      a = b % a
      b = temp
    }
    b
  }

  // 函数式风格
  def gcd(x: Int, y: Int): Int = {
    if (y == 0) x else gcd(y, x % y)
  }
}
