package xyz.shiqihao.misc

import com.google.gson.Gson

import scala.collection.JavaConverters._

object JsonDemo extends App {

  val s = Seq("1", "2", "3")

  val params = List("{k1}", "{k2}")

  val values = Seq("v1", "v2")

  val m = params.map(_.replaceAll("[{}]", "")).zip(values)

  val ss: Seq[Seq[String]] = Seq(Seq("p1", "n1"), Seq("p2", "n2"))

  val b = ss.map(s => params.map(_.replaceAll("[{}]", "")).zip(s).toMap)

  val phoneNums = List("15968912980")

  val shortMessage = ShortMessage(Some("kafka"))

  println(new Gson().toJson(new BagOfPrimitives))
  println(new Gson().toJson(s.asJava))
  println(m.toMap)
  println(new Gson().toJson(m.toMap.asJava))
  println(b.asJava)
  println(new Gson().toJson(b.map(m => m.asJava).asJava))
  println(new Gson().toJson(b.asJava))
  println(new Gson().toJson(phoneNums.map(_ => shortMessage.signName.get).asJava))
  println(phoneNums.map(_ => shortMessage.signName).asJava)
  val map = Map[String, String](
    "k1" -> "v1",
    "k2" -> "v2"
  )

  val num = Seq(" ", " ", " ")
  println(new Gson().toJson(num.asJava))

  val l = List("")
  println(new Gson().toJson(l.asJava))
}

class BagOfPrimitives {
  private val i = 0
  private val s = "string"
}

case class ShortMessage(signName: Option[String])
