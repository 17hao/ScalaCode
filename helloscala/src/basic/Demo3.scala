package basic

object Demo3 {
  def main(args: Array[String]): Unit = {
    val num = 1
    val num2: Double = num
    //val num3:Byte = num // num:Int不能转换成Byte类型
    println(num.toDouble)
    println(num.toLong)
    println(num.toByte)
    println(num2)
    //print(num3)
  }
}
