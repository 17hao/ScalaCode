package helloscala.kafka

import java.util
import java.util.Properties

import org.apache.kafka.clients.consumer.KafkaConsumer
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

  properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
  properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
  properties.put("group.id", "test-consumer-group")
  val consumer = new KafkaConsumer[String, String](properties)
  consumer.subscribe(util.Arrays.asList("test"))
  while (true) {
    val records = consumer.poll(100)
    records.forEach(record => println(s"key is: ${record.key}; value is: ${record.value()}"))
  }
  consumer.close()
}
