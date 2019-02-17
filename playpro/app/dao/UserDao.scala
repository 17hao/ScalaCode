package dao

import javax.inject.Inject
import models.User
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfilei
import scala.concurrent.{ExecutionContext, Future}

class UserDao @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  private val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  // 定义与数据库相对应的类
  private class UserTable(tag: Tag) extends Table[User](tag, "user") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)

    def name = column[String]("name")

    def age = column[Int]("age")

    def * = (id, name, age) <> ((User.apply _).tupled, User.unapply)
  }

  // 所有对USER表做的操作的开始
  private val user = TableQuery[UserTable]

  // 列出所有用户
  def list(): Future[Seq[User]] = db.run(user.result)

  // 新增一个用户
  def create(id: Int, name: String, age: Int): Future[Int] = db.run(
    user.map(u => (u.id, u.name, u.age)) += (id, name, age)
  )

  //def create(name: String, age: Int): Future[User] = db.run {
  //  (user.map(u => (u.name, u.age))
  //    returning user.map(_.id)
  //    into ((nameAge, id) => User(id, nameAge._1, nameAge._2))
  //    ) += (name, age)
  //}

  // 删除一个用户
  def delete(id: Int): Future[Int] = db.run(
    user.filter(_.id === id).delete
  )

  // 修改一个用户
  def update(id: Int, name: String, age: Int): Future[Int] = db.run(
    (for (u <- user if u.id === id) yield (u.name, u.age)).update(name, age)
  )
}
