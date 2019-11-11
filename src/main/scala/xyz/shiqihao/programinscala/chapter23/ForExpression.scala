package xyz.shiqihao.programinscala.chapter23

object ForExpression01 extends App {
  val lara = Person("lara", isMale = false)
  val bob = Person("bob", isMale = true)
  val julie = Person("julie", false, lara, bob)
  val persons = List(lara, bob, julie)
  val flatMapRes = persons.filter(!_.isMale).flatMap(p => p.children.map(c => (p.name, c.name)))
  println(flatMapRes)

  val forRes = for {
    p <- persons
    if !p.isMale
    c <- p.children
  } yield (p.name, c.name)
  println(forRes)
}

case class Person(
                   name: String,
                   isMale: Boolean,
                   children: Person*
                 )
