package xyz.shiqihao.guava

import com.google.common.hash.{HashFunction, Hasher, Hashing}

object HashTest1 extends App {
  val hf: HashFunction = Hashing.murmur3_32()
  val hc = hf.newHasher().putLong(1L).hash().asInt()
  println(hc)
}
