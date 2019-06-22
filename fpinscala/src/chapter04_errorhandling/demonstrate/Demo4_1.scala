package chapter04_errorhandling.demonstrate


object Demo4_1 {
  /**
    * def mean is a partial function, it doesn't handle some type of the argument, e.g. xs is empty
    *
    * @param xs
    * @return
    */
  def mean(xs: Seq[Int]): Int = {
    if (xs.isEmpty)
      throw new ArithmeticException("The list is empty")
    else
      xs.sum / xs.length
  }

  /**
    * pure functional method by use Option
    *
    * @param xs
    * @return
    */
  def meanV2(xs: Seq[Int]): Option[Int] = {
    if (xs.isEmpty) None
    else Some(xs.sum / xs.length)
  }
}
