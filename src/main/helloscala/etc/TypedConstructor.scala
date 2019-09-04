package helloscala.etc

trait Boxed[T] {
  def unpack(): T
}

class Some[T](val value: T) extends Boxed[T] {
  override def unpack(): T = this.value
}

object TypedConstructor extends App {
  def f[A, B, C[A] <: Boxed[A]](f: A => B, v: C[A]): B = f(v.unpack())

  val res: Int = f((n: Int) => n + 1, new Some(2)) // Option[Int]
  println(res)
}