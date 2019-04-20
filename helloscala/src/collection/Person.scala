package collection

/**
 * @author 17hao
 * @date 2019-04-18 11:43
 */
case class Person(age: Int, name: String)

object Person extends App {
  val person1 = new Person(20, "sqh")
  val person2 = new Person(20, "lyj")
  val person3 = new Person(20, "zzx")
  val list = List(person1, person2, person3)
  val res = list.filter(p => p.name == "sqh")
  println(res)
}