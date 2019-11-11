package test.helloscala

import org.scalatest.FunSuite

class HelloSpec extends FunSuite {
  test("test") {
    assert("hello".startsWith("h"))
  }
}
