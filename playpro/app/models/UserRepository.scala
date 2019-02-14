package models

import javax.inject.Inject
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{Future, ExecutionContext}

class UserRepository @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  private val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  // 定义与数据库相对应的类
  private class UserTable(tag: Tag) extends Table[User](tag, "USER") {
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)

    def name = column[String]("name")

    def age = column[Int]("age")

    def * = (id, name, age) <> ((User.apply _).tupled, User.unapply)
  }

  // 所有对USER表做的操作的开始
  private val user = TableQuery[UserTable]

  // 列出所有用户
  def list(): Future[Seq[User]] = db.run(user.result)

  // 新增一个用户
  def create(name: String, age: Int): Future[User] = db.run {
    (user.map(u => (u.name, u.age))
      returning user.map(_.id)
      into ((nameAge, id) => User(id, nameAge._1, nameAge._2))
      ) += (name, age)
  }
}
