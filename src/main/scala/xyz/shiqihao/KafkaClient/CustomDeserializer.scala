package xyz.shiqihao.KafkaClient

import java.util

import com.google.common.base.Charsets
import com.google.gson.Gson
import org.apache.kafka.common.serialization.Deserializer

class CustomDeserializer extends Deserializer[CustomRecord] {
  override def configure(configs: util.Map[String, _], isKey: Boolean): Unit = {}

  override def deserialize(topic: String, data: Array[Byte]): CustomRecord = {
    new Gson().fromJson(new String(data, Charsets.UTF_8), classOf[CustomRecord])
  }

  override def close(): Unit = {}
}
