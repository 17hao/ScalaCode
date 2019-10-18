package xyz.shiqihao.ProgInScala.chapter21

import xyz.shiqihao.ProgInScala.chapter06.Rational

object ImplicitScenes2 extends App {
  /*
    隐式转换场景2：
      转换接收端
   */
  val num1 = new Rational(1, 2)
  val num2 = new Rational(1, 2)
  //Rational类中有重载的'+'方法支持Rational和Integer
  //但是不支持Integer和Rational
  //加入Integer到Rational的隐式转换
  println(num1 + num2)
  println(num1 + 1)

  //编译器会去寻找隐式转换：从int到另一种类型能应用'+'到Rational类
  implicit def intToRational(a: Int) = {
    new Rational(a, 1)
  }

  println(1 + num1)
}
