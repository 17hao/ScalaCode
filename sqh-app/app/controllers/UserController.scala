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
        error => {
          BadRequest(Json.obj("status" -> "wrong", "message" -> error.toString))
        },
        user => {
          userDAO.createUser(user.name, user.age)
          Ok(Json.obj("status" -> "ok", "message" -> "create success"))
        }
      )
  }

  def delUser(id: Int) = Action.async(
    userDAO.delUser(id).map(
      user =>
        if (user == 1) // 删除成功返回1
          Ok(Json.obj("status" -> "ok", "message" -> "delete success"))
        else (BadRequest(Json.obj("status" -> "wrong", "message" -> "not found")))
    )
  )

  def updateUser = Action(parse.json) {
    request =>
      request.body.validate[User].fold(
        error =>
          BadRequest(Json.obj("status" -> "wrong", "message" -> error.toString)),
        user =>
          Ok(Json.obj("status" -> "ok", "message" -> "update success"))
      )
  }

  def getUsers = Action.async(
    userDAO.getUsers().map(
      user => Ok(Json.toJson(user))
    )
  )
}
