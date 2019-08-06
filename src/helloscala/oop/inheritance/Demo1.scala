package oop.inheritance

object Test extends App {
  val c = new Car("car")

}

abstract class Machine {
  def name: String

  def weight: Int = name.length
}

/** Defining a parametric field */
class Car(override val name: String) extends Machine