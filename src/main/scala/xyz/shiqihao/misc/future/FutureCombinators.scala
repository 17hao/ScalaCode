package xyz.shiqihao.misc.future

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class FutureCombinators {
  def sumOfThreeNumbersSequentialMap(): Future[Int] = {
    Future {
      Thread.sleep(1000)
      1
    }.flatMap { oneValue =>
      Future {
        Thread.sleep(2000)
        2
      }.flatMap { twoValue =>
        Future {
          Thread.sleep(3000)
          3
        }.map { thirdValue =>
          oneValue + twoValue + thirdValue
        }
      }
    }
  }

  def sumOfThreeNumbersParallelMap(): Future[Int] = {
    val oneFuture: Future[Int] = Future {
      Thread.sleep(1000)
      1
    }

    val twoFuture: Future[Int] = Future {
      Thread.sleep(2000)
      2
    }

    val threeFuture: Future[Int] = Future {
      Thread.sleep(3000)
      3
    }
    oneFuture.flatMap { oneValue =>
      twoFuture.flatMap { twoValue =>
        threeFuture.map { threeValue =>
          oneValue + twoValue + threeValue
        }
      }
    }
  }

  def sumOfThreeNumbersSequentialForComprehension(): Future[Int] = {
    for {
      oneFuture <- Future {
        Thread.sleep(1000)
        1
      }
      twoFuture <- Future {
        Thread.sleep(2000)
        2
      }
      threeFuture <- Future {
        Thread.sleep(3000)
        3
      }
    } yield oneFuture + twoFuture + threeFuture
  }

  def sumOfThreeNumbersParallelMapForComprehension(): Future[Int] = {
    val oneFuture: Future[Int] = Future {
      Thread.sleep(1000)
      1
    }

    val twoFuture: Future[Int] = Future {
      Thread.sleep(2000)
      2
    }

    val threeFuture: Future[Int] = Future {
      Thread.sleep(3000)
      3
    }
    for {
      oneValue <- oneFuture
      twoValue <- twoFuture
      threeValue <- threeFuture
    } yield oneValue + twoValue + threeValue
  }
}
