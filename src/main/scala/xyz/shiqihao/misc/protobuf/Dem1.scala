package xyz.shiqihao.misc.protobuf

object Dem1 extends App {
  def buildPerson(): ProtobufPerson.Person = {
    val person: ProtobufPerson.Person.Builder = ProtobufPerson.Person.newBuilder()
    person.setName("sqh")
    person.setAge(22)
    person.setEmail("sqh1107@gmail.com")
    person.build()
  }

  val p = buildPerson()
  println(s"name is: ${p.getName}")
}
