package fp

object CurryingDemo2 {
  def currying(a: Int)(b: Int): Int = {
    a + b
  }

  def currying2(f: (Int, Int) => Int): Int => Int => Int = {
    a => b => f(a, b)
  }

  def main(args: Array[String]): Unit = {
    val tmp = currying(1)(_)
    println(tmp)
    println(tmp(2))

    val curry2tmp = currying2((a, b) => a + b)
    val curry2tmp2 = curry2tmp(1)

    println(curry2tmp)
    println(curry2tmp2)
    println(curry2tmp(1)(_))
    println(curry2tmp(1)(2))
  }
}
