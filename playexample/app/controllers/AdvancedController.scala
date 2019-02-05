package controllers

import javax.inject.Inject
import play.api.libs.json.JsValue
import play.api.mvc.{AbstractController, ControllerComponents, Request, AnyContent}

class AdvancedController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  // Action深入:
  // trait Action里有一个parser方法，解析HTTPrequest的里的body(紧跟于request head后面)
  // 可以指定解析的格式，也可以不指定交给Play
  def save1= Action {
    // 不指定解析的格式,default parser
    request: Request[AnyContent] =>
      val body: AnyContent = request.body
      val jsonBody: Option[JsValue] = body.asJson
      jsonBody.map { json =>
        Ok("Got: " + (json \ "name").as[String])
      }.getOrElse {
        BadRequest("Expecting application/json request body")
      }
  }

  def save2 = Action(parse.tolerantJson) {
    // 向Action的apply方法中传入一个body parser参数
    request: Request[JsValue] =>
      Ok("Got: " + (request.body \ "name").as[String])
  }
}
