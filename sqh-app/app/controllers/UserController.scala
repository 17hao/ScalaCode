package controllers

import javax.inject.Inject
import models.{User, UserDAO}
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, ControllerComponents}

import scala.concurrent.ExecutionContext

class UserController @Inject()(userDAO: UserDAO, cc: ControllerComponents)(implicit ec: ExecutionContext) extends
  AbstractController(cc) {
  def addUser = Action(parse.json) {
    request =>
      request.body.validate[User].fold(
        errors => {
          BadRequest(Json.obj("status" -> "wrong", "message" -> errors.toString))
        },
        user => {
          userDAO.createUser(user.name, user.age)
          Ok(Json.obj("status" -> "ok"))
        }
      )
  }

  //  def delUser(id: Int) = Action {
  //    userDAO.delUser(id).map(
  //      user => Ok(Json.toJson(""))
  //    ).getOrElse()
  //  }
  //}
}
