package helloscala.implicitt

object ImplicitDemo {
  def main(args: Array[String]): Unit = {
    trait Sayable {
      def say()
    }

    implicit object Hello extends Sayable {
      override def say(): Unit = {
        println("hello,world!")
      }
    }

    def func1(implicit x: Sayable): Unit = {
      x.say()
    }

    // 调用方法的时候不用传入参数，编译器去寻找implicit修饰符合类型的参数
    func1

    implicit val x: Int = 5

    def func2(implicit x: Int): Unit = {
      println(x)
    }

    // 同理，编译器自动去寻找，而不必传入参数
    func2
  }
}
