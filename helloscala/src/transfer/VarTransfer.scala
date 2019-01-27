package transfer

object VarTransfer {
  def main(args: Array[String]): Unit = {
    val num = 1
    println(num.toDouble)
    println(num.toLong)
    println(num.toByte)

    val num2: Double = num
    println(num2)

    //val num3:Byte = num // num:Int不能转换成Byte类型
    //print(num3)

    val num4 = 3.5
    println(num4.toInt)
  }
}
