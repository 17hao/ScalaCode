package xyz.shiqihao.misc.protobuf

import com.google.gson.Gson
import xyz.shiqihao.misc.protobuf.ProtobufMessage.Message

import scala.collection.JavaConverters._

object Main extends App {

  def initial(): ProtobufMessage.Message = {
    val infoList = Seq(UserInfo(Seq("15968912980", "sqh", "23")), UserInfo(Seq("15868170425", "lyj", "23")))
    val params = Seq("{user}", "{age}")
    val numbers = infoList.map(u => u.seq.head)
    val temp = infoList.map(_.seq.tail)
    val paramValues = new Gson().toJson(
      temp.map { v =>
        params.map(_.replaceAll("[{}]", "")).zip(v).toMap
      }.map(_.asJava).asJava
    )
    Message.newBuilder()
      .setReceiver(new Gson().toJson(numbers.asJava))
      .addTemplate("SMS-123")
      .setTemplateParam(paramValues)
      .build()
  }

  println(initial())
}

final case class UserInfo(seq: Seq[String])