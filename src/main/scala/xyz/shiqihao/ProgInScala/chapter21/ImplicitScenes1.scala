package xyz.shiqihao.ProgInScala.chapter21

object ImplicitScenes1 extends App {
  /*
    隐式转换场景1：
      隐式转换到一个预期的类型
   */
  def double2int(a: Double) = {
    //将高精度转换到低精度，不是一个好主意
    a.toInt
  }

  //scala在Predef中加入了隐式转换，可以将低精度转换到高精度
  val res:Double = 3

  println(double2int(3.5))
  println(res)
}
