package xyz.shiqihao.misc.patternmatch

object Demo3 extends App {
  def func(i: Int): String = i match {
    case 1 | 3 | 5 | 7 | 9 => "13579"
    case 2 | 4 | 6 | 8 => "2468"
  }

  func(9).foreach(print)
}
