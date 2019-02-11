package controllers

import play.api.mvc._
import play.api.libs.json._
import play.api.libs.functional.syntax._
import javax.inject.Inject
import models.{Location, Place}

// JSON with HTTP demo in Play doc
class JsonController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  // firstly convert model to a JsValue representation
  // this is accomplished by defining an implicit Writes[Place[
  implicit val locationWrites: Writes[Location] = (
    (JsPath \ "lat").write[Double] and
      (JsPath \ "long").write[Double]
    ) (unlift(Location.unapply))

  implicit val placeWrites: Writes[Place] = (
    (JsPath \ "name").write[String] and
      (JsPath \ "location").write[Location]
    ) (unlift(Place.unapply))

  def listPlaces: Action[AnyContent] = Action {
    // def toJson[T](o:T)(implicit tjs:Writes[T]):JsValue
    // Play会自动识别结果为JSON，并设置相应的content-type
    val json: JsValue = Json.toJson(Place.list)
    Ok(json)
  }


  // firstly define an implicit Reads[T] to convert JsValue to model
  implicit val locationReads: Reads[Location] = (
    (JsPath \ "lat").read[Double] and
      (JsPath \ "long").read[Double]
    ) (Location.apply _)

  implicit val placeReads: Reads[Place] = (
    (JsPath \ "name").read[String] and
      (JsPath \ "location").read[Location]
    ) (Place.apply _)

  def savePlace = Action(parse.json) { request =>
    val placeResult = request.body.validate[Place]
    placeResult.fold(
      errors => {
        BadRequest(Json.obj("status" -> "KO", "message" -> JsError.toJson(errors)))
      },
      place => {
        Place.save(place)
        Ok(Json.obj("status" -> "OK", "message" -> ("Place '" + place.name + "' saved.")))
      }
    )
  }
}
