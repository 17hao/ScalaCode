package controllers

import javax.inject.Inject
import dao.UserDao
import models.User
import play.api.mvc.{AbstractController, ControllerComponents}
import play.api.libs.json._

import scala.concurrent.ExecutionContext

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

  def addUser = Action(parse.json)(
    request =>
      request.body.validate[User].fold(
        errors => {
          BadRequest(Json.obj("status" -> "wrong", "message" -> JsError.toJson(errors)))
        },
        user => {
          userDao.create(user.id, user.name, user.age)
          Ok(Json.toJson("status" -> " ok"))
        }
      )
  )

  def updateUser = Action(parse.json)(
    request =>
      request.body.validate[User].fold(
        errors => {
          BadRequest(Json.obj("status" -> "wrong"))
        },
        user => {
          userDao.update(user.id, user.name, user.age)
          Ok(Json.toJson("status" -> "ok"))
        }
      )
  )

  def delUser(id: Int) = Action.async {
    userDao.delete(id).map(
      user => Ok(Json.toJson(user))
    )
  }
}