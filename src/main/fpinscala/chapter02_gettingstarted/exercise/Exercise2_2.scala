package fpinscala.chapter02_gettingstarted.exercise

object Exercise2_2 {
  /**
    * Check whether an Array[A] is sorted according to a given comparison function
    *
    * @param as
    * @param order
    * @tparam A
    * @return
    */
  def isSorted[A](as: Array[A], order: (A, A) => Boolean): Boolean = {
    def loop(n: Int): Boolean = {
      if (n == as.length - 1)
        true
      else if (order(as(n), as(n + 1)))
        loop(n + 1)
      else
        false
    }

    loop(0)
  }

  def main(args: Array[String]): Unit = {
    val as = Array(1, 2, 3, 4, 5, 6) // true
    val ss = Array("aa", "aa", "aaa") // false

    def oder(m: Int, n: Int): Boolean = {
      if (m < n) true
      else false
    }

    def order(str1: String, str2: String): Boolean = {
      if (str1.length < str2.length) true
      else false
    }

    println(isSorted(as, oder))
    println(isSorted(ss, order))
  }
}
