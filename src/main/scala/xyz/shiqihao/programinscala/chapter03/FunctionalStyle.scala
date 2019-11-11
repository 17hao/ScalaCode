package xyz.shiqihao.programinscala.chapter03

object FunctionalStyle extends App {
  print(formatArg(Array("hello", "sqh")))

  /**
   * Functional programming: without side-effect
   * reference transparently
   */
  def formatArg(args: Array[String]) = args.mkString("\n")
}
