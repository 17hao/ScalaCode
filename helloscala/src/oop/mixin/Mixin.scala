package oop.mixin

object Mixin extends App {
  // 创建对象的时候混入trait，可以不污染原有的类
  val postgreSQL = new PostgreSQL with Operate
  postgreSQL.insert(100)

  val mySQL = new MySQL with Operate
  mySQL.insert(200)

  // 抽象类中有  没有实现的方法
  val oracle = new Oracle with Operate {
    override def say(): Unit = {
      println("hello world")
    }
  }

  oracle.insert(300)
  oracle.say()
}

trait Operate {
  def insert(num: Int): Unit = {
    println("插入数据：" + num)
  }
}

class PostgreSQL {
  // 空
}

abstract class MySQL {
  // 空
}

abstract class Oracle {
  def say()
}