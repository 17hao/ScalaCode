package xyz.shiqihao.misc.DI

import javax.inject.Inject

class Car @Inject()(engine: Engine, wheel: Wheel) {
  override def toString: String = s"car's engine is: $engine, wheel is: $wheel"
}
