package xyz.shiqihao.programinscala.chapter08

import scala.io.Source

object FindLongLines extends App {
  val filename = "./src/main/scala/xyz/shiqihao/programinscala/chapter08/FindLongLines.scala"
  val width = 10
  LongLine.processFile(filename, width)
}

object LongLine {
  def processFile(filename: String, width: Int): Unit = {
    // Local function. To avoid defining too much helper function to pollute the env.
    def processLine(line: String): Unit = {
      if (line.length > width)
        println(line.trim)
    }

    val source = Source.fromFile(filename)
    for (line <- source.getLines)
      processLine(line)
  }
}
