package chapter10

abstract class Element {
  /*
    目标：设计一个类库，绘制二维字符串图形
    1.能实例化创建简单字符串图案
    2.字符串图案左右组合、上下组合
   */
  def contents: Array[String] //声明（declaration）字符图案

  //定义（definition）成无参方法的原因是：这是类库的设计，def length可以改成val length，却不影响类库的调用者
  def length: Int = contents.length
  def width: Int = if (length == 0) 0 else contents(0).length
}
