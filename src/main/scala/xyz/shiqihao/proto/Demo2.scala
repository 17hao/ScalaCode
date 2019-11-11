package xyz.shiqihao.proto

import scala.collection.JavaConverters._

object Main extends App {

  def initial(): ProtobufMessage.Message = {
    val infoList = List(UserInfo(Seq("15968912980", "sqh")), UserInfo(Seq("15868170425", "lyj")))
    val temp = infoList.map { i =>
      ProtobufMessage.Message.UserInfo.newBuilder().addAllValue(i.seq.asJava).build()
    }
    ProtobufMessage.Message.newBuilder()
      .setProviderKey("key")
      .setProviderValue("value")
      .setSignName("signName")
      .setTemplateCode("SMS-123")
      .setSmsProvider(ProtobufMessage.Message.SmsProvider.ALIYUN)
      .addAllUserInfo(temp.asJava)
      .build()
  }

  def getProvider: String = {
    initial().getSmsProvider match {
      case ProtobufMessage.Message.SmsProvider.ALIYUN => "aliyun"
      case _ => "other"
    }
  }

  println(getProvider)
  println(initial().getUserInfoList.asScala.map(_.getValueList.asScala.head))
}

final case class UserInfo(seq: Seq[String])