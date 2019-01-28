package basic

object TwoSum {
  def main(args: Array[String]): Unit = {
    val nums = Array(2, 7, 11, 15)
    val target = 13
    val res = TwoSum(nums, target)
    println(res)
    for (e <- res) {
      println(e)
    }
  }

  // leetcode No.1
  // Given an array of integers, return indices of the two numbers
  // such that they add up to a specific target.
  def TwoSum(nums: Array[Int], target: Int): Array[Int] = {
    val res = new Array[Int](2)
    for (i <- 0 to (nums.length - 2)) {
      for (j <- i + 1 until nums.length) {
        if ((nums(i) + nums(j)) == target) {
          res(0) = i
          res(1) = j
        }
      }
    }
    res
  }
}
