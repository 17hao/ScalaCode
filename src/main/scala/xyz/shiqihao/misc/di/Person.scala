package xyz.shiqihao.misc.di

import javax.inject.Inject

class Person @Inject()(car: Car) {
  override def toString: String = s"I have a car $car"
}
