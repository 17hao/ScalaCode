package helloscala

import com.google.gson.Gson

object JsonDemo extends App {

  val obj = new Gson().toJson(new BagOfPrimitives)

  val l = Seq[Int](1,2,3)

  val gson = new Gson().toJson(l)

  println(obj)
  println(gson)
}

class BagOfPrimitives {
  private val i = 0
  private val s = "string"
}
