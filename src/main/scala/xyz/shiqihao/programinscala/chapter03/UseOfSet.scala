package xyz.shiqihao.programinscala.chapter03

object UseOfSet {
  /**
   * 默认是immutable.set
   * 用var修饰nameSet意味着在后面追加元素创建了新的set
   * 变量nameSet指向了新的对象
   */
  def main(args: Array[String]): Unit = {
    var nameSet = Set("sqh", "lyj")
    nameSet += "qwe"
    println(nameSet)
    println(nameSet.contains("sqh"))
    import scala.collection.mutable
    val mutableSet = mutable.Set(1, 2)
    mutableSet += 3
    println(mutableSet)
  }
}
