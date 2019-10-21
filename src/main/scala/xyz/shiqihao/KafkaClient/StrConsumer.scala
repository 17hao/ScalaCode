package xyz.shiqihao.KafkaClient

import java.util
import java.util.Properties

import org.apache.kafka.clients.consumer.KafkaConsumer

object StrConsumer extends App {
  val properties = new Properties
  properties.put("bootstrap.servers", "localhost:9092")
  properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
  properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
  properties.put("group.id", "test-consumer-group")
  val consumer = new KafkaConsumer[String, String](properties)
  consumer.subscribe(util.Arrays.asList("test"))
  while (true) {
    val records = consumer.poll(100)
    records.forEach(record => println(s"key is: ${record.key}; value is: ${record.value()}"))
  }
}
