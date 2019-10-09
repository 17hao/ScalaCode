package xyz.shiqihao.proto

object Demo extends App {
  def buildPerson(): PersonProto.Person = {
    val person: PersonProto.Person.Builder = PersonProto.Person.newBuilder()
    person.setName("sqh")
    person.setAge(22)
    person.setEmail("sqh1107@gmail.com")
    person.build()
  }

  val p = buildPerson()
  println(s"name is: ${p.getName}")
}
