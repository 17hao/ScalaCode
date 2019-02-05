package controllers

import javax.inject.Inject
import play.api.Configuration
import play.api.mvc.{AbstractController, ControllerComponents}

// 控制器通常被定义为利用依赖注入的类
// Play中控制器就是Action的生成器
class MyController @Inject()(config: Configuration, c: ControllerComponents) extends AbstractController(c) {
  def getFoo() = Action {
    Ok(config.get[String]("bar"))
  }

  // 最基础的Action，没有引用任何HTTP请求
  // 简单来说Action就是request=>result
  def index() = Action {
    Ok("Hello,World")
  }

  // 加入一个HTTP请求
  // 通常情况下用implicit关键字修饰request,这样可以被其他APIs隐式调用
  def echo() = Action { implicit request =>
    Ok("Got request [" + request + "]")
  }

  // 创建不同类型的result
  def notFound() = Action {
    NotFound
  }

  // 在URI中传入参数
  def hello(name: String) = Action {
    Ok("Hello" + name + "!")
  }

  // reverse routing：通过路由反推出URL
  def helloSqh() = Action {
    Redirect(controllers.routes.MyController.hello("Sqh"))
  }
}
