package collection

object MapDemo {
  def main(args: Array[String]): Unit = {
    var map = Map(1 -> "one", 2 -> "two")
    println(map)
    map += (3 -> "three")
    println(map)
    // map(1) = "one_" 会出错，因为immutable.Map本身是不可变的

    var map_ = scala.collection.mutable.Map[String, String]()
    map_ += ("1" -> "one")
    println(map_)
    map_("1") = "one_"
    println(map_)
  }
}
