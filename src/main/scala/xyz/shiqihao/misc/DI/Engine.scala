package xyz.shiqihao.misc.DI

import javax.inject.Inject

class Engine @Inject()(version: String) {
  override def toString: String = s"engine version is: $version"
}
