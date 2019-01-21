object FuncDemo {
  def main(args: Array[String]): Unit = {
    val num1 = 10
    val num2 = 20
    //val oper = '-'
    print("res = " + getRes(num1, num2, '-'))
  }

  def getRes(num1: Int, num2: Int, oper: Char) = {
    if (oper == '+') {
      num1 + num2
    } else if (oper == '-') {
      num1 - num2
    } else {
      null
    }
  }
}