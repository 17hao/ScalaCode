package models

import javax.inject.Inject
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

class UserDAO @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {

  private val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  private class UserTable(tag: Tag) extends Table[User](tag, "USER") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)

    def name = column[String]("name")

    def age = column[Int]("age")

    def * = (id, name, age) <> ((User.apply _).tupled, User.unapply)
  }

  private val users = TableQuery[UserTable]

  db.run(
    users.schema.create
  )

  def createUser(name: String, age: Int) = db.run(
    users.map(u => (u.name, u.age)) += (name, age)
  )

  def delUser(id: Int) = db.run(
    users.filter(_.id === id).delete
  )

  def updateUser(id: Int, name: String, age: Int) = db.run(
    (for (u <- users if u.id === id) yield (u.name, u.age)).update(name, age)
  )

  // 返回值类型好像推断不出来所以具体指明
  def getUsers(): Future[Seq[User]] = db.run(
    users.result
  )
}