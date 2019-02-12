package basic

object LazyDemo {
  def main(args: Array[String]): Unit = {
    val builder = new StringBuilder
    val x = {
      builder += 'x';
      1
    }
    lazy val y = {
      builder += 'y';
      2
    }

    def z = {
      builder += 'z';
      3
    }

    // val 定义的表达式会且只会执行一次
    // val由lazy修饰后不会按顺序主动去执行，除非有调用它的指令
    z + y + x + z + y + x // xzyz
    //z+y
    //x+y+z
    println(builder.result())
  }
}
