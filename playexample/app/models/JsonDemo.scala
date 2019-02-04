package models

import play.api.libs.json._

object JsonDemo {
  def main(args: Array[String]): Unit = {
    val json: JsValue = Json.parse(
      """
        |{
        |    "name" : "Watership Down",
        |    "location" : {
        |      "lat" : 51.235685,
        |      "long" : -1.309197
        |    },
        |    "residents" : [ {
        |      "name" : "Fiver",
        |      "age" : 4,
        |      "role" : null
        |    }, {
        |      "name" : "Bigwig",
        |      "age" : 6,
        |      "role" : "Owsla"
        |    } ]
        |  }
      """.stripMargin)
  }
}
