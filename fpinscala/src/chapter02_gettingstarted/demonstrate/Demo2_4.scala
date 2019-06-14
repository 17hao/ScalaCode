package chapter02_gettingstarted.demonstrate

import scala.annotation.tailrec

object Demo2_4 extends App {
  /**
    * polymorphic function which works for any type it is given
    *
    * @param as  element array
    * @param key target value
    * @param gt  way of comparision
    * @tparam A parameter type
    * @return
    */
  def binarySearchPoly[A](as: Array[A], key: A, gt: (A, A) => Boolean): Int = {
    @tailrec
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
}
