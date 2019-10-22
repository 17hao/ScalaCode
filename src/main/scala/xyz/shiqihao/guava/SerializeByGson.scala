package xyz.shiqihao.guava

import com.google.common.base.Charsets
import com.google.gson.Gson

object SerializeByGson extends App {
  val c = C("k", "v")
  val str = new Gson().toJson(c, classOf[C])
  println(str)
  println(str.getBytes(Charsets.UTF_8))
}

case class C(field1: String, field2: String)
