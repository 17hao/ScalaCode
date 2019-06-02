package basic

object LazyDemo extends App {
  val builder = new StringBuilder

  val x = {
    builder += 'x'
    1
  }

  lazy val y = {
    builder += 'y'
    2
  }

  def z = {
    builder += 'z'
    3
  }

  /**
    * Fields or methods prefixed with 'val' will only be executed once
    * Fields or methods are computed by need when 'val' is prefixed with 'lazy'
    */
  z + y + x + z + y + x
  println(builder.result())
}
