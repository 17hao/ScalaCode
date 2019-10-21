package xyz.shiqihao.KafkaClient

case class CustomRecord(key: String, value: String) {
  def details: String = {
    s"key is: $key, value is: $value"
  }
}
