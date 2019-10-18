package xyz.shiqihao.ProgInScala.chapter03

object UseOfMap {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable
    // 在任意Scala对象上调用'->'方法会返回一个包含左右2个元素的元组,实际上是隐式转换的机制
    println(1 -> "sqh")
    val nameMap = mutable.Map[Int, String]()
    nameMap += (1 -> "sqh")
    nameMap += (2 -> "lyj")
    println(nameMap)
    println(nameMap.contains(1))
  }
}
