package xyz.shiqihao.KafkaClient

import java.util
import java.util.Properties

import org.apache.kafka.clients.consumer.KafkaConsumer
import org.apache.kafka.common.serialization.StringDeserializer

object ObjConsumer extends App {
  val prop = new Properties
  prop.put("bootstrap.servers", "localhost:9092")
  prop.put("group.id", "test-consumer-group")
  val keyDeserializer = new StringDeserializer()
  val valueDeserializer = new CustomDeserializer()
  val consumer = new KafkaConsumer[String, CustomRecord](prop, keyDeserializer, valueDeserializer)
  consumer.subscribe(util.Arrays.asList("test"))
  while (true) {
    val records = consumer.poll(100)
    records.forEach(r => println(s"get details: ${r.value().details}"))
  }
}
