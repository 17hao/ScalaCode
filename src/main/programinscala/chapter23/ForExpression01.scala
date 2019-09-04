package main.programinscala.chapter23

object ForExpression01 extends App {
  val lara = Person("lara", false)
  val bob = Person("bob", true)
  val julie = Person("julie", false, lara, bob)
  val persons = List(lara, bob, julie)
  //val res = persons.filter(!_.isMale).map(p => p.children.map(c => (p.name, c.name)))
  val flatMapRes = persons.filter(!_.isMale).flatMap(p => p.children.map(c => (p.name, c.name)))
  //println(middle)
  println(flatMapRes)

  val forRes = for {
    p <- persons
    if (!p.isMale)
    c <- p.children
  } yield (p.name, c.name)
  println(forRes)

  //val list = List(null, "1", "2")
  //val tmp = list.map(l => (l,"3"))
  //println(tmp)
}

case class Person(
                   name: String,
                   isMale: Boolean,
                   children: Person*
                 )
