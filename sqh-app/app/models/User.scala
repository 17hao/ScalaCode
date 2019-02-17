package models

import play.api.libs.json._
import play.api.libs.functional.syntax._

case class User(id: Int, name: String, age: Int)

object User {
  // class->json
  implicit val userWrite: Writes[User] = (
    (JsPath \ "id").write[Int] and
      (JsPath \ "name").write[String] and
      (JsPath \ "age").write[Int]
    ) (User.unapply _)

  // json->class
  implicit val userRead: Reads[User] = (
    (JsPath \ "id").read[Int] and
      (JsPath \ "name").read[String] and
      (JsPath \ "age").read[Int]
    ) (User.apply _)
}