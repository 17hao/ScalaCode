package fp.style


object FunctionalGcd extends App {
  // imperative
  def gcdLoop(x: Int, y: Int): Int = {
    var a = x
    var b = y
    while (a != 0) {
      var temp = a
      a = b % a
      b = temp
    }
    b
  }

  // functional
  def gcd(x: Int, y: Int): Int = {
    if (y == 0) x else gcd(y, x % y)
  }

  // functional and imperative styles to achieve the greatest common divisor
  println(gcdLoop(55, 20))
  println(gcd(55, 20))
}
