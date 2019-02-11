package collection

object MapFunc {
  def main(args: Array[String]): Unit = {
    val person = Vector("sqh", "lyj")
    // map方法将集合中的每个元素进行变换
    val person_ = person.map(e => e.toUpperCase)
    println(person_)

    val age = Vector(1,2,3,4)
    // map也可以实现for/yield类似的功能
    val age_ = age.map(e => e+2)
    print(age_)
  }
}
