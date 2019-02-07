package models

case class Location(lat: Double, long: Double)

case class Place(name: String, location: Location)

object Place {
  var list: List[Place] = {
    List(
      Place(
        "cixi",
        Location(1, 1)
      ),
      Place(
        "hangzhou",
        Location(2, 2)
      )
    )
  }

  def save(place: Place): Unit = {
    list = list ::: List(place)
  }
}
