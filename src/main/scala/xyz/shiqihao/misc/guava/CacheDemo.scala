package xyz.shiqihao.misc.guava

import java.util.concurrent.TimeUnit

import com.google.common.cache.{Cache, CacheBuilder}

object CacheDemo extends App {
  val cache: Cache[String, String] = CacheBuilder.newBuilder()
    .maximumSize(3)
    .expireAfterWrite(10, TimeUnit.SECONDS)
    .build()
  cache.put("k1", "v1")
  println(cache.getIfPresent("k1"))
}
