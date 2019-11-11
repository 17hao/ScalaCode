package xyz.shiqihao.basic.collection

import scala.collection.mutable.ListBuffer

/**
 * passing empty list as argument
 */
object Test extends App {
  val l = List[Int]()
  var curRate = 0
  val buffer = new ListBuffer[Int]()
  val result = l.groupBy(_ < 1).values.map { msgList=>
    msgList.indices foreach { index =>
      curRate += msgList(index)
      buffer.append(msgList(index))
    }
    buffer.head
  }.toList
  print(result)
}
