package xyz.shiqihao.misc.patternmatch

object Demo2 extends App {
  val a = "foo"

  a match {
    case "foo" | "a" => println("a")
    case "foo" | "b" => println("b")
  }
}
