package collection

object FlatMap {
  def main(args: Array[String]): Unit = {
    val list = List(List(1, 2), List(2, 3, 4, 5))
    // flatten方法只可以用在只有内嵌序列（list、array、vector）作为元素的序列
    val flatList = list.flatten
    println(flatList) // List（1，2，2，3，4，5）
    println(list.flatten.distinct) // List（1，2，3，4，5）

    val bag = List("1", "2", "three", "4", "one hundred")

    // 将每个可以转换为数字的元素转换并求和
    def toInt(in: String): Option[Int] = {
      try {
        Some(Integer.parseInt(in))
      } catch {
        case _: Exception => None
      }
    }
    // map将原List转换成包含Some和None的List
    // map实现的是类型的转换
    println(bag.map(toInt)) // List(Some(1), Some(2), None, Some(4), None)
    // flatten可以取出Some中的值并将None去掉
    println(bag.map(toInt).flatten) // List(1, 2, 4)
    println(bag.flatMap(toInt).sum)
  }
}
