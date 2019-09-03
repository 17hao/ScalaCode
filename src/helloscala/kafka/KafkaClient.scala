package helloscala.kafka

import java.util.Properties

import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}

object KafkaClient extends App {
  val properties = new Properties
  properties.put("bootstrap.servers", "localhost:9092")
  properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
  properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")
  val producer = new KafkaProducer[String, String](properties)
  val record = new ProducerRecord[String, String]("test", "produce a message")
  producer.send(record)
  producer.close()
}
