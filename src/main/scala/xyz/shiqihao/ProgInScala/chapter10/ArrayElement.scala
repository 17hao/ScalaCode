package xyz.shiqihao.ProgInScala.chapter10

//类的主构造器中参数前加val,定义参数化字段，等于同时定义类的属性
class ArrayElement(val contents: Array[String]) extends Element {
  override def width: Int = contents(0).length

  override def height: Int = if (width == 0) 0 else contents.length
}
