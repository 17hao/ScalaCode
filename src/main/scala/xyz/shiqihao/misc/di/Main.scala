package xyz.shiqihao.misc.di

import com.google.inject.Guice


object Main extends App {
  val person = Guice.createInjector().getInstance(classOf[Person])
  print(person)
}
