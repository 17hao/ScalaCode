package xyz.shiqihao.misc.akka

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.{ActorRef, Behavior}

object ActorDemo_2 {

  final case class Greet(whom: String, relyTo: ActorRef[Greeted])

  final case class Greeted(whom: String, from: ActorRef[Greet])

  def apply(): Behavior[Greet] = Behaviors.receive { (context, message) =>
    context.log.info(s"Hello ${message.whom}")
    message.relyTo ! Greeted(message.whom, context.self)
    Behaviors.same
  }
}
