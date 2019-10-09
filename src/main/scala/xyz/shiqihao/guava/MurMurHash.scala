package xyz.shiqihao.guava

import java.util.Random

import com.google.common.base.Charsets
import com.google.common.hash.Hashing

object MurMurHash extends App {
  def buckId(n: String) = {
    Hashing.murmur3_128()
      .newHasher()
      .putString(n, Charsets.UTF_8)
      .hash().asInt() % 100
  }

  //val hashId = Hashing.murmur3_128()
  //  .newHasher()
  //  .putString("6543", Charsets.UTF_8)
  //  .hash().asInt() % 100
  //print(hashId)
  def random = {
    (new Random().nextInt(100) % 100).toString
  }

  1 to 100 foreach (_ => println(Math.abs(buckId(random))))
}
