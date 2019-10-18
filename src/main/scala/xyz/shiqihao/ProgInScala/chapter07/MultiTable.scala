package xyz.shiqihao.ProgInScala.chapter07

import scala.collection.immutable

object MultiTable {
  // 函数式风格打印乘法表,要格式对齐
  // 不产生副作用,有返回值
  def main(args: Array[String]): Unit = {
    println(multiTable(10))
  }

  // ①将一行存放在Seq中
  def multiRowSeq(row: Int): immutable.IndexedSeq[String] = {
    for (col <- 1 to 10) yield {
      val product = (col * row).toString
      val padding = " " * (4 - product.length)
      product + padding
    }
  }

  // ②转换成String
  def multiRowString(row: Int): String = multiRowSeq(row).mkString

  // ③返回10行乘法表
  def multiTable(row: Int): String = {
    val tableSeq = {
      for (row <- 1 to 10) yield multiRowString(row)
    }
    tableSeq.mkString("\n")
  }
}
