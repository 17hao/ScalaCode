package xyz.shiqihao.basic.future

import org.scalatest.{FunSpec, Matchers}

import scala.concurrent.Await
import scala.concurrent.duration._

class FutureCombinatorsTest extends FunSpec with Matchers with ConcurrentUtils {

  describe("Futures") {
    it("could be composed using map") {
      val futureCombinators = new FutureCombinators()
      //val result = timed(Await.result(futureCombinators.sumOfThreeNumbersSequentialMap(), 7 seconds))
      //result shouldBe 6
      val result = timed(Await.result(futureCombinators.sumOfThreeNumbersParallelMapForComprehension(), 7 seconds))
      result shouldBe 6
    }
  }
}

trait ConcurrentUtils {
  def timed[T](block: => T): T = {
    val start = System.currentTimeMillis()
    val result = block
    val duration = System.currentTimeMillis() - start
    println(s"Time taken : $duration")
    result
  }
}
