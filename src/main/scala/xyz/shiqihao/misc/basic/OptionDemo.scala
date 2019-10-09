package basic

case class User(id: Int, name: String, age: Int, gender: Option[String])

object OptionDemo {
  private val users = Map(
    1 -> User(1, "sqh", 22, Some("male")),
    2 -> User(2, "lyj", 22, None)
  )

  def findAll: Iterable[User] = users.values

  def main(args: Array[String]): Unit = {
    val user1 = findById(1)
    val user2 = findById(2)
    if (user1.isDefined)
      println(user1.flatMap(user => Option(user.name)).getOrElse("No such person"))
    if (user2.isDefined)
      println(user2.flatMap(user => Option(user.name)).getOrElse("No such person"))
  }

  def findById(id: Int): Option[User] = users.get(id)
}


