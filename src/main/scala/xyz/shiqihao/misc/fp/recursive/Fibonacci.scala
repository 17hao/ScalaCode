package xyz.shiqihao.misc.fp.recursive

object Fibonacci {
  def main(args: Array[String]): Unit = {
    /*     斐波那契数列
    0 1 1 2 3 5 8 13 21 34 ... */
    val index = 10
    println("recursive_fibo:" + fibo(index))
    print("tail_recursive_fibo: " + fibo(0, 1, index))
  }

  /*
  def fibo(index: Int): Int = {
    if (index == 0) {
      0
    } else if (index == 1) {
      1
    } else {
      fibo(index - 1) + fibo(index - 2)
    }
  }
  */

  // 更优雅的写法
  def fibo(index: Int): Int = index match {
    case 0 => 0
    case 1 => 1
    case _ => fibo(index - 1) + fibo(index - 2)
  }

  // 更优雅的写法
  def fibo(num1: Int, num2: Int, index: Int): Int = {
    //if (index == 0) {
    //  num1
    //} else {
    //  fibo(num2, num1 + num2, index - 1)
    //}
    if (index == 0) num1 else fibo(num2, num1 + num2, index - 1)
  }
}
