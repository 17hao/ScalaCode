package xyz.shiqihao.misc.chuanglan

import scala.collection.JavaConverters._

object ChuanglanSmsMain extends App {
  def send() = {
    val path = "http://smssh1.253.com/msg/variable/json"
    val account = "CN5254124"
    val password = "DvAGWu37Rl51fd"
    val msg = "【创蓝253】您的验证码是:{$var}"
    val phoneNums = Seq("15968912980", "15868170425")
    val paramsValue = Seq("135", "246")
    val params = phoneNums.map { p =>
      Map(p -> paramsValue(phoneNums.indexOf(p))).asJava
    }.mkString(";").replaceAll("[{}]", "").replace("=", ",")
    println(params)
    val requestBody = new SmsVariableRequest.Builder(account, password, msg, params).build()
    //HttpClient.sendShortMessage(path, new Gson().toJson(requestBody))
  }

  println(send())
}