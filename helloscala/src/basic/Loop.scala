package basic

object Loop extends App {
  val str = "hello, world!"
  for (i <- 0 until str.length) {
    print(str(i))
  }
}
