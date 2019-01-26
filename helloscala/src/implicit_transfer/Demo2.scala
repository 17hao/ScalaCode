package implicit_transfer

object Demo2 {
  def main(args: Array[String]): Unit = {
    // 使用隐式转换动态给Mysql类添加功能
    // 能不能用trait？
    implicit def addDelete(mysql: Mysql): DB = {
      new DB
    }

    val mysql = new Mysql
    val mysql_ = new Mysql with DB_
    mysql.insert()
    mysql.delete() // 底层编译器通过创建DB的对象
    mysql_.delete_()
  }
}

class Mysql {
  def insert(): Unit = {
    println("插入数据")
  }
}

class DB {
  def delete(): Unit = {
    println("删除数据")
  }
}

trait DB_ {
  def delete_(): Unit = {
    println("删除数据trait")
  }
}
