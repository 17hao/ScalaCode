package controllers

import javax.inject.Inject
import play.api.Configuration
import play.api.mvc.{AbstractController, ControllerComponents}

class MyController @Inject()(config: Configuration, c: ControllerComponents) extends AbstractController(c) {
  //def getFoo_() = Action {
  //  Ok(config.get[String]("foo"))
  //}

  def getFoo() = Action {
    Ok(config.get[String]("bar"))
  }
}
