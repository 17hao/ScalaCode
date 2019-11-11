package xyz.shiqihao.programinscala.chapter10

/**
 * 字符串图案，只有单一的一行
 * 子类要向父类的主构造器传递参数
 */
class LineElement(s: String) extends ArrayElement(Array(s)) {
  override def width: Int = s.length

  override def height: Int = 1
}
