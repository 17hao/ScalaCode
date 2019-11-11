package xyz.shiqihao.misc.di

import javax.inject.Inject

class Wheel @Inject()(color: String) {
  override def toString: String = s"wheel color is: $color"
}
