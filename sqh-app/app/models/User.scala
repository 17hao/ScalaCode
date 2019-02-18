package models

import play.api.libs.json._
import play.api.libs.functional.syntax._

case class User(id: Int, name: String, age: Int)

object User {
  implicit val userFormat: OFormat[User] = Json.format[User]
}