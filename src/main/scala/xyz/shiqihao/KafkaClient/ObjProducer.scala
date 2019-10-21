package xyz.shiqihao.KafkaClient

import java.util.Properties
import java.util.concurrent.TimeUnit

import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}
import org.apache.kafka.common.serialization.StringSerializer

object ObjProducer extends App {
  val prop = new Properties()
  prop.put("bootstrap.servers", "localhost:9092")
  val keySerializer = new StringSerializer()
  val valueSerializer = new CustomSerializer()

  val producer = new KafkaProducer[String, CustomRecord](prop, keySerializer, valueSerializer)
  val customRecord = CustomRecord("id", "name")
  val record = new ProducerRecord[String, CustomRecord]("test", "CustomizeRecord", customRecord)
  producer.send(record)
  producer.close(1000, TimeUnit.MILLISECONDS)
}