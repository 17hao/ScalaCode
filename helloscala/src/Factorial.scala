object Factorial {
  def main(args: Array[String]): Unit = {
    println(factorial(5))
    print(factorial(5, 1))
  }

  // 普通递归
  def factorial(n: Int): Int = {
    if (n <= 0) {
      0
    } else if (n == 1) {
      1
    } else {
      factorial(n - 1) * n
    }
  }

  // 尾递归
  def factorial(n: Int, tmp: Int): Int = {
    if (n <= 0) {
      0
    } else if (n == 1) {
      tmp
    } else {
      factorial(n - 1, n * tmp)
    }
  }
}
