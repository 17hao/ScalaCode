package xyz.shiqihao.misc.DI

import com.google.inject.Guice


object Main extends App {
  val person = Guice.createInjector().getInstance(classOf[Person])
  print(person)
}
