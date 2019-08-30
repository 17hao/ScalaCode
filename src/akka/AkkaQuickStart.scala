package akka

import akka.Printer.Greeting
import akka.actor.{Actor, ActorLogging, ActorRef, ActorSystem, Props}

class Greeter(message: String, printer: ActorRef) extends Actor {

  import Greeter._

  var greeting = ""

  override def receive: Receive = {
    case WhoToGreet(who) =>
      greeting = message + ":" + who
    case Greet =>
      printer ! Greeting(greeting)
  }
}

object Greeter {

  final case class WhoToGreet(who: String)

  case object Greet

  def props(message: String, printer: ActorRef): Props = Props[Greeter](new Greeter(message, printer))
}

class Printer extends Actor with ActorLogging {

  import Printer._

  override def receive: Receive = {
    case Greeting(greeting) =>
      log.info("Greeting receive from: " + sender() + " " + greeting)
  }
}

object Printer {

  final case class Greeting(greeting: String)

  def props: Props = Props[Printer]
}

object AkkaQuickStart extends App {

  import Greeter._

  val system = ActorSystem("ActorSystem")

  val printer = system.actorOf(Printer.props, "printerActor")

  val howdyGreeter = system.actorOf(Greeter.props("howdy", printer))
  val helloGreeter = system.actorOf(Greeter.props("hello", printer))

  howdyGreeter ! WhoToGreet("Akka")
  howdyGreeter ! Greet

  helloGreeter ! WhoToGreet("LightBend")
  helloGreeter ! Greet
}
