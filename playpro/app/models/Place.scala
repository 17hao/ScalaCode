package models

case class Location(lat: Double, long: Double)

case class Place(name: String, location: Location)

// the model for json with HTTP programming
object Place {
  var list: List[Place] = {
    List(
      Place(
        "cixi",
        Location(1.1, 2.2)
      ),
      Place(
        "hangzhou",
        Location(3.3, 4.4)
      )
    )
  }

  def save(place: Place): Unit = {
    list = list ::: List(place)
  }
}
