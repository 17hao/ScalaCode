package xyz.shiqihao.misc

object ImplicitTest extends App {
  def getIndexOf[CC, T](seq: CC, value: T)(implicit conv: CC => Seq[T]) = seq.indexOf(value)

  print(getIndexOf("abd", 'c'))
}
