package pattern_matching

import scala.util.Random

object Demo1 {
  def main(args: Array[String]): Unit = {
    // 模式匹配基础语法
    val x: Int = Random.nextInt(10)

    def matchTest(x: Int): String = x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case _ => "others"
    }

    println(x.toString + " " + matchTest(x))
  }
}
