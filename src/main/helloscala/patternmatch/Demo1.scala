package main.helloscala.patternmatch

import scala.util.Random

object Demo1 extends App {
  val x: Int = Random.nextInt(10)

  /** Basic syntax */
  def matchTest(x: Int): String =
    x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case _ => "others"
    }

  println(x.toString + " is " + matchTest(x))
}
