package controllers

import javax.inject.Inject
import models.UserRepository
import play.api.mvc.{AbstractController, ControllerComponents}
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.validation.Constraints._
import scala.concurrent.{ExecutionContext, Future}

class UserController @Inject()(repo: UserRepository, cc: ControllerComponents)(implicit ex: ExecutionContext) extends AbstractController(cc) {
  val userForm = Form {
    mapping(
      "name" -> nonEmptyText,
      "age" -> number.verifying(min(0), max(100))
    )(CreateUserForm.apply)(CreateUserForm.unapply)
  }

  def index() = Action {
    implicit request =>
      Ok(views.html.index(userForm))
  }
}

case class CreateUserForm(name: String, age: Int)