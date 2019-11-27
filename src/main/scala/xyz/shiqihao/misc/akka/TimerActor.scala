package xyz.shiqihao.misc.akka

import java.time.Duration._
import java.time._

import akka.actor.{Actor, ActorLogging, ActorRef, ActorSystem, Props, Timers}
import xyz.shiqihao.misc.akka.TimerActor.{FirstTick, Tick, TimerKey}

class TimerActor extends Actor with Timers with ActorLogging {
  override def receive: Receive = tickJob()

  private def tickJob(): PartialFunction[Any, Unit] = {
    case FirstTick =>
      timers.startTimerWithFixedDelay(TimerKey, Tick, ofMillis(3000))
      log.info("Starting timer...")
    case Tick =>
      log.info(s"periodic job executes in ${LocalDate.now()}")
  }

  timers.startSingleTimer(TimerKey, FirstTick, ofMillis(2000))
}

object TimerActor {
  def props: Props = Props[TimerActor](new TimerActor)

  final case object TimerKey

  final case object FirstTick

  final case object Tick

}

object TimerActorMain extends App {
  val context: ActorSystem = ActorSystem.create("TimerActor")
  val actor: ActorRef = context.actorOf(TimerActor.props)
  actor ! FirstTick
  actor ! Tick
}