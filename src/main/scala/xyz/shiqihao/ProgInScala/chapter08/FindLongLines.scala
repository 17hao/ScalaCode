package xyz.shiqihao.ProgInScala.chapter08

import scala.io.Source

object FindLongLines extends App {
  val filename = "/Users/17hao/IdeaProjects/Scalademo/ProgrammingInScala/src/chapter8/FindLongLines.scala"
  val width = 10
  LongLine.processFile(filename, width)
}

object LongLine {
  def processFile(filename: String, width: Int): Unit = {
    // 函数的嵌套，即局部函数，可以使用外层函数的参数
    // 同时可以避免定义过多的helper function污染环境
    def processLine(line: String): Unit = {
      if (line.length > width)
        println(line.trim)
    }

    val source = Source.fromFile(filename)
    for (line <- source.getLines)
      processLine(line)
  }
}
