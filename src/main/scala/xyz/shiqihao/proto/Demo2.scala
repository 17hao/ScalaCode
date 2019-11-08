package xyz.shiqihao.proto

import scala.collection.JavaConverters._

class Demo2 {
  def setValue(): MessageProto.Message = {
    val infoList = List(UserInfo(Seq("15968912980", "sqh")), UserInfo(Seq("15868170425", "lyj")))
    val r = infoList.map { i =>
      MessageProto.Message.UserInfo.newBuilder().addAllValue(i.seq.asJava).build()
    }
    MessageProto.Message.newBuilder()
      .setProviderKey("key")
      //.setProviderValue("value")
      .addAllUserInfo(r.asJava)
      .build()
  }
}


object Main extends App {
  val d = new Demo2
  println(d.setValue())
}

final case class UserInfo(seq: Seq[String])