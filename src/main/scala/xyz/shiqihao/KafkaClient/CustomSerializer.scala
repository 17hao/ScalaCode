package xyz.shiqihao.KafkaClient

import java.util

import com.google.common.base.Charsets
import com.google.gson.Gson
import org.apache.kafka.common.serialization.Serializer

class CustomSerializer extends Serializer[CustomRecord] {
  override def configure(configs: util.Map[String, _], isKey: Boolean): Unit = {}

  override def serialize(topic: String, data: CustomRecord): Array[Byte] = {
    new Gson().toJson(data).getBytes(Charsets.UTF_8)
  }

  override def close(): Unit = {}
}
