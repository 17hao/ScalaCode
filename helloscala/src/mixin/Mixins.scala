package mixin

object Mixins {
  def main(args: Array[String]): Unit = {
    // 创建对象的时候混入trait，可以不污染原有的类
    val postgresql = new Postgresql with Oprate
    postgresql.insert(100)

    val mySQL = new MySQL with Oprate {}
    mySQL.insert(200)

    // 抽象类中有  没有实现的方法
    val mySQL_ = new MySQL_ with Oprate {
      override def say(): Unit = {
        println("hello world")
      }
    }

    mySQL_.insert(300)
    mySQL_.say()
  }
}

trait Oprate {
  def insert(num: Int): Unit = {
    println("插入数据：" + num)
  }
}

class Postgresql {
  // 空
}

abstract class MySQL {
  // 空
}

abstract class MySQL_ {
  def say()
}