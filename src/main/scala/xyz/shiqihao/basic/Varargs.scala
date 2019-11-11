package xyz.shiqihao.basic

object Varargs extends App {
  val res = sum(1, 2, 3, 4, 5, 6, 7)
  /**
    * : _* tells the compiler treat a single argument of a sequence
    * type as a variable argument sequence
    */
  val resV2 = sum(1 to 5: _*)

  /** Variable arguments sequence */
  def sum(args: Int*): Int = {
    def loop(i: Int, res: Int): Int = i match {
      case 0 => res
      case _ => loop(i - 1, res + args(i - 1))
    }

    loop(args.length, 0)
  }
  println(res)
}
