package chapter02_gettingstarted.demonstrate

import scala.annotation.tailrec

object Demo2_3 {
  /**
    * Monomorphic function
    *
    * @param is  integer array
    * @param key target value
    * @return
    */
  def binarySearch(is: Array[Int], key: Int): Int = {
    @tailrec
    def loop(low: Int, high: Int): Int = {
      val mid = high - low / 2
      if (is(mid) == key) mid
      else if (is(mid) > key) loop(low, mid - 1)
      else if (is(mid) < key) loop(mid + 1, high)
      else -1
    }

    loop(0, is.length - 1)
  }

  def findFirst(ss: Array[String], key: String): Int = {
    @tailrec
    def loop(n: Int): Int = {
      if (n >= ss.length) -1
      else if (ss(n) == key) n
      else loop(n + 1)
    }

    loop(0)
  }

  def main(args: Array[String]): Unit = {
    val is = Array(1, 2, 3, 4, 5, 6, 7)

    println(binarySearch(is, 7))
  }
}
