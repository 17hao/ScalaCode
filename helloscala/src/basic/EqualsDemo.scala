package basic

object EqualsDemo {
  def main(args: Array[String]): Unit = {
    val sqh = new Employe("sqh", 22)
    println(sqh)
    val lyj = new Employe("lyj", 22)
    println(lyj)
    println(sqh == lyj)
    println(sqh equals lyj)
  }
}

class Employe(inName: String, inAge: Int) {
  override def toString: String = "name is: " + inName + " age is: " + inAge

  override def hashCode(): Int = super.hashCode()
}
