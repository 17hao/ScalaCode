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

  def random = {
    (new Random().nextInt(100) % 100).toString
  }

  print(Math.abs(buckId("1f27c8ca-d57d-38f3-b1f8-dd6a5dc9e2c7")) % 100)
}
