package collection

object VectorDemo {
  def main(args: Array[String]): Unit = {
    val vec = Vector(1, 2, 3, 4)
    // vector是不可变集合，它的结构类似于树
    // 当update时并不是创建一个全新的vector，而是创建新的分支，开销相对较低
    println(vec updated(3, 5))
  }
}
