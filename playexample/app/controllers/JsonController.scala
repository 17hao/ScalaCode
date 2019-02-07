package controllers

import javax.inject.Inject
import models.Location
import play.api.libs.json.{JsPath, Writes}
import play.api.mvc.{AbstractController, ControllerComponents}

class JsonController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  // models=>JsValue
  implicit val locationWrites: Writes[Location] = (
    (JsPath \ "lat").write[Double] and
      (JsPath \ "long").write[Double]
    )(unlift(Location.unapply))
}
