package functional

object MethodDiffFunc {
  // 函数和方法的细微区别和联系
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3)
    // 函数：遍历一个数组的元素并乘2
    val func = (array: Array[Int]) => for (x <- array) print(x * 2 + " ")
    method(arr)
    func(arr)
  }

  // 方法：遍历一个数组的元素并乘2
  def method(arr: Array[Int]): Unit = {
    for (x <- arr) {
      print(x * 2 + " ")
    }
  }

}
