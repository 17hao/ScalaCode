package chapter04_errorhandling.demonstrate

sealed trait Option[+A] {
  def map[B](f: A => B): Option[B]

  def flatMap[B](f: A => Option[B]): Option[B]

  def getOrElse[B >: A](default: => B): Option[B]
}

case class Some[A](get: A) extends Option[A]

case object None extends Option[Nothing]


object Test {
  def main(args: Array[String]): Unit = {
    val i = Some(1)
    val d = i.map(int => int.toDouble)
    println(d)
  }
}
