package controllers

import javax.inject.Inject
import dao.UserDao
import play.api.mvc.{AbstractController, ControllerComponents}
import play.api.libs.json._
import play.api.libs.functional.syntax._

import scala.concurrent.{ExecutionContext, Future}

class UserController @Inject()(userDao: UserDao, cc: ControllerComponents)
                              (implicit ex: ExecutionContext) extends AbstractController(cc) {
  //implicit val userWrite: Writes[repo] = (
  //  (JsPath \ "name").write[String] and
  //    (JsPath \ "age").write[Int]
  //  ) (unlift(repo.apply))
  //
  //def list = Action {
  //  val users = Json.toJson(repo.list())
  //  Ok(users)
  //}

  def getUsers = Action.async {
    userDao.list() map {
      user => Ok(Json.toJson(user))
    }
  }
  def addUser(name:String,age:Int)=Action
}