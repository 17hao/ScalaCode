package functionalp

object ExerciseDemo {
  def main(args: Array[String]): Unit = {
    val nums = List(1, 2, 3, 4)
    println(Product.reduce(nums))
    println(Sum.reduce(nums))
  }
}

abstract class Reducer(init: Int) {
  def combine(x: Int, y: Int): Int

  def reduce(xs: List[Int]): Int = {
    xs match {
      case Nil => init
      case y :: ys => combine(y, reduce(ys))
    }
  }
}


object Product extends Reducer(1) {
  override def combine(x: Int, y: Int): Int = x * y
}

object Sum extends Reducer(0) {
  override def combine(x: Int, y: Int): Int = x + y
}
