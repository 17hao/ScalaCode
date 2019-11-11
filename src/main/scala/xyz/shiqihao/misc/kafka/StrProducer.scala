package xyz.shiqihao.misc.kafka

import java.util.Properties
import java.util.concurrent.TimeUnit

import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}

object StrProducer extends App {
  val properties = new Properties
  properties.put("bootstrap.servers", "localhost:9092")
  properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
  properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")
  val producer = new KafkaProducer[String, String](properties)
  (1 to 10).map { i =>
    val record = new ProducerRecord[String, String]("test", "index is: " + i)
    producer.send(record)
  }
  producer.close(1000, TimeUnit.MILLISECONDS)
}
