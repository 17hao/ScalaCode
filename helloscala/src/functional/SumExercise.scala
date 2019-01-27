package functional

// calculate the sum of a to b
object SumExercise {
  def main(args: Array[String]): Unit = {
    println(imperatve_sum(1, 10))
    println(functional_sum(x => x, 1, 10))
  }

  // imperative programming
  def imperatve_sum(a: Int, b: Int): Int = {
    var sum = 0
    for (i <- a to b) {
      sum += i
    }
    sum
  }

  // functional programming
  def functional_sum(f: Int => Int, a: Int, b: Int): Int = {
    def loop(x: Int, acc: Int): Int = {
      if (x > b) acc
      else loop(x + 1, f(x) + acc)
    }

    loop(a, 0)
  }
}
