package xyz.shiqihao.guava

import com.google.gson.{JsonObject, JsonPrimitive}

object GsonDemo extends App {
  val c = C("k", "v")
  val res = new JsonObject()
  res.add("key", new JsonPrimitive(c.field1))
  res.add("value", new JsonPrimitive(c.field2))
  print(res.toString)
}

case class C(field1: String, field2: String)
