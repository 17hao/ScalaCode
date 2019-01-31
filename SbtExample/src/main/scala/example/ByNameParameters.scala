package example

object ByNameParameters {
  def main(args: Array[String]): Unit = {
    var i = 2
    whileloop(i > 0){
      println(i)
      i -= 1
    }
  }

  def whileloop(condition: => Boolean)(body: => Unit): Unit = {
    if (condition) {
      body
      whileloop(condition)(body)
    }
  }
}
