package implicit_transfer

object ImplicitVal01 {
  def main(args: Array[String]): Unit = {
    implicit val name: String = "sqh"
    //val name2: String = "lyj"

    def func(implicit content: String = "xxx"): Unit = {
      println("func: " + content)
    }

    func("lyj") // lyj 优先级：传值->implicit->默认值

    def func2(implicit content: String = "lyj"): Unit = {
      println("func2: " + content)
    }

    func2 // sqh implict优先级高

    implicit val name2: Int = 10

    def func3(implicit content: String = "lyj"): Unit = {
      println("func3: " + content)
    }

    func3 // 注释掉Implicit val name 输出 lyj 类型不匹配时使用默认值
  }
}
