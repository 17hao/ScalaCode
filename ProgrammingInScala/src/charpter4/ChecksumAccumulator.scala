package charpter4

class ChecksumAccumulator {
  private var sum = 0

  def add(a: Int) = sum += a
}

/*
  同一个源文件中定义companion object
  伴生对象和类可以相互访问私有成员
  伴生对象不可以实例化（传递参数进来）
  如果只定义一个伴生对象，会生成一个synthetic class(ObjectName$)
  伴生对象不仅仅是静态方法的集合，可以理解成对象身上附加的标签
 */
object ChecksumAccumulator {

  import scala.collection.mutable

  private val cached = mutable.Map[String, Int]()

  def calculate(s: String) = {
    if (cached.contains(s))
      cached(s)
    else {
      val acc = new ChecksumAccumulator
      acc.add(s.toInt)
      cached += (s -> acc.sum)
    }
  }
}

object start extends App {
  println(ChecksumAccumulator.calculate("123"))
}
