package xyz.shiqihao.misc.sms.chuanglan

import com.google.gson.Gson

import scala.collection.JavaConverters._

object ChuanglanSmsMain extends App {
  def send() = {
    val path = "http://smssh1.253.com/msg/variable/json"
    val phoneNums = Seq("15968912980", "158681704255")
    val paramsValue2 = Seq("135", "246")
    val params = phoneNums.map { p =>
      p + "," + paramsValue2(phoneNums.indexOf(p))
    }.mkString(";")
    //val params = phoneNums.mkString(",")
    val map = Map[String, String](
      "account" -> "N6617746",
      "password" -> "QyNIekidR03897",
      "msg" -> "【GrowingIO】验证码{$var}，有效时间5分钟。您正在重置密码，切勿将验证码泄露于他人。",
      "params" -> params
    ).asJava
    println(new Gson().toJson(map))
    //HttpClient.sendShortMessage(path, new Gson().toJson(map))
  }

  println(send())
}
