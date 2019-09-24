package xyz.shiqihao.helloscala.patternmatch

object Demo2 extends App {
  val a = "foo"

  a match {
    case "foo" | "a" => println("a")
    case "foo" | "b" => println("b")
  }
}
