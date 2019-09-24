package main.scala.proto

import main.scala.proto.PersonProto.Person

object Demo extends App {
  def buildPerson(): Person = {
    val person: Person.Builder = PersonProto.Person.newBuilder()
    person.setName("sqh")
    person.setAge(22)
    person.setEmail("sqh1107@gmail.com")
    person.build()
  }

  val p = buildPerson()
  println(s"name is: ${p.getName}")
}
