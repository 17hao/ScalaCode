package basic

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val tmp = 0
    for(tmp <- 1 to 3){
      println(tmp)
    }
    print("hello,Scala")
  }
}
