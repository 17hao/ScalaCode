package helloscala

import com.google.gson.Gson

import scala.collection.JavaConverters._

object JsonDemo extends App {

  val s = Seq("1", "2", "3")

  val k = List("k1", "k2")

  val v = List("v1", "v2")

  val m = k.zip(v)

  println(new Gson().toJson(new BagOfPrimitives))
  println(new Gson().toJson(s.asJava))
  println(m.toMap)
  println(new Gson().toJson(m.toMap.asJava))

  val map = Map[String, String](
    "k1" -> "v1",
    "k2" -> "v2"
  )
}

class BagOfPrimitives {
  private val i = 0
  private val s = "string"
}
