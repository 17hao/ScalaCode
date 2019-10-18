package xyz.shiqihao.ProgInScala.chapter10

/*
  指定长和宽，由单一字符组成的二维图案
 */
class UniformElement(
                      ch: Char,
                      override val width: Int,
                      override val height: Int
                    ) extends Element {
  private val line = ch.toString * width

  override def contents: Array[String] = Array.fill(height)(line)
}
