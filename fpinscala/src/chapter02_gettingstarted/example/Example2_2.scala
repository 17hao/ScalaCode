package chapter02_gettingstarted.example

object Example2_2 {
  /**
    * Search the first index of a String in an array
    *
    * @param ss
    * @param key
    * @return
    */
  def findFirst(ss: Array[String], key: String): Int = {
    def loop(n: Int): Int = {
      if (n >= ss.length)
        -1
      else if (ss(n) == key)
        n
      else
        loop(n + 1)
    }

    loop(0)
  }

  /**
    * polymorphic function which works for any type it is given
    *
    * @param as
    * @param key
    * @param gt
    * @tparam A
    * @return
    */
  def binarySearch[A](as: Array[A], key: A, gt: (A, A) => Boolean): Int = {
    def loop(low: Int, mid: Int, high: Int): Int = {
      if (low > high)
        -mid - 1
      else {
        val mid2 = (low + high) / 2
        val a = as(mid2)
        val greater = gt(a, key)
        if (!greater && !gt(key, a))
          mid2
        else if (greater)
          loop(low, mid2, mid2)
        else
          loop(mid2 + 1, mid2, high)
      }
    }

    loop(0, 0, as.length)
  }

  def main(args: Array[String]): Unit = {
    val ss = Array("a", "b", "c")
    val is = Array(1, 2, 3, 4, 5, 6, 7)

    def gt(x: Int, y: Int): Boolean = if (x > y) true else false

    println(findFirst(ss, "d"))
    println(binarySearch(is, 7, gt))
  }
}
