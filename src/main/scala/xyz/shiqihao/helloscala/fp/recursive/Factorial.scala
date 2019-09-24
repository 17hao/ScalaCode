package xyz.shiqihao.helloscala.fp.recursive

object Factorial {
  // 计算阶乘
  def main(args: Array[String]): Unit = {
    println(factorial(5))
    print(factorial(5, 1))
  }

  // 普通递归
  /*
  def factorial(n: Int): Int = {
    if (n <= 0) {
      0
    } else if (n == 1) {
      1
    } else {
      factorial(n - 1) * n
    }
  }
  */

  def factorial(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case _ => factorial(n - 1) * n

  }

  // 尾递归
  def factorial(n: Int, tmp: Int): Int = n match {
    //if (n <= 0) {
    //  0
    //} else if (n == 1) {
    //  tmp
    //} else {
    //  factorial(n - 1, n * tmp)
    //}
    case 0 => 0
    case 1 => tmp
    case _ => factorial(n - 1, n * tmp)
  }
}
