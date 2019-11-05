package xyz.shiqihao.AkkaDemo

import akka.actor.{Actor, ActorLogging, ActorSystem, Props}

class ActorDemo_1 extends Actor with ActorLogging {
  override def receive: Receive = {
    case s: String => log.info(job.apply(s))
    case _ => log.info(fail().apply())
  }

  private def job: PartialFunction[String, String] = {
    case s: String => s"message length is: ${s.length.toString}"
  }

  private def fail(): PartialFunction[Unit, String] = {
    case _ => "cannot implement."
  }
}

object Demo {
  def props: Props = Props[ActorDemo_1](new ActorDemo_1())
}

object Starter extends App {
  val context = ActorSystem.create("test")
  val demo = context.actorOf(Demo.props)
  demo ! "test"
  demo ! 1
}
