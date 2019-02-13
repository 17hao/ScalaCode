import slick.driver.H2Driver.api._

class Suppliers(tag: Tag) extends Table[(Int, String, String, String, String, String)](tag, "SUPPLIERS") {
  def id = column[Int]("SUP_ID", O.PrimaryKey)

  def name = column[String]("SUP_NAME")

  def street = column[String]("SUP_STREET")

  def city = column[String]("SUP_CITY")

  def state = column[String]("SUP_STATE")

  def zip = column[String]("SUP_ZIP")

  def * = (id, name, street, city, state, zip)
}

class Coffees(tag: Tag) extends Table[(String, Int, Double, Int, Int)](tag, "COFFEES") {
  def name = column[String]("COF_NAME", O.PrimaryKey)

  def supID = column[Int]("SUP_ID")

  def price = column[Double]("PRICE")

  def sales = column[Int]("SALES")

  def total = column[Int]("TOTAL")

  def * = (name, supID, price, sales, total)

  def supplier = foreignKey("SUP_FK", supID, TableQuery[Suppliers])(_.id)
}
