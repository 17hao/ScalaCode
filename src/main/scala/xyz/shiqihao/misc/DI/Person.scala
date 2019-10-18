package xyz.shiqihao.misc.DI

import javax.inject.Inject

class Person @Inject()(car: Car) {
  override def toString: String = s"I have a car $car"
}
