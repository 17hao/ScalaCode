package xyz.shiqihao.misc.sms

import java.util.regex.Pattern

import com.yunpian.sdk.YunpianClient
import com.yunpian.sdk.constant.YunpianConstant

import scala.collection.mutable.ListBuffer

object Yunpian extends App {
  def queryTemplate(templateCode: String, apiKey: String) = {
    val client = new YunpianClient(apiKey).init()
    val param = client.newParam(1)
    param.put("tpl_id", templateCode)
    //new Gson().fromJson(client.tpl().get(param).getData.get(0).toString, classOf[Template])
    client.tpl().get(param).getData.get(0).getTpl_content
  }

  def querySignName(templateCode: String, apiKey: String) = {
    val client = new YunpianClient(apiKey).init()
    val param = client.newParam(1)
    param.put(YunpianConstant.SIGN, templateCode)
    val signs = client.sign().get(param).getData.getSign
    if (signs.size() > 0) {
      signs.get(0).getSign
    } else {
      "not found"
    }
  }

  def sendSingleMessage(templateCode: String, apiKey: String, phoneNumber: String,
                        testValues: List[String]) = {

    val client = new YunpianClient(apiKey).init()
    val param = client.newParam(2)
    val msg = queryTemplate(templateCode, apiKey).replaceAll("\\#(.*?)\\#", "%s").format(testValues: _*)
    param.put(YunpianConstant.MOBILE, phoneNumber)
    param.put(YunpianConstant.TEXT, msg)
    val response = client.sms().single_send(param)
    if (response.getCode > 0) {
      Left(response.getDetail)
    } else {
      Right(response.getDetail)
    }
  }

  def getTemplateParams(templateContent: String) = {
    val pattern = Pattern.compile("\\#(.*?)\\#")
    val matcher = pattern.matcher(templateContent)
    val result = new ListBuffer[String]
    while (matcher.find()) {
      result += templateContent.substring(matcher.start(), matcher.end())
    }
    result.toList
  }

  //println(queryTemplate("3288962", "493566a5ccda4a706ac1369f1be363b3"))
  //println(querySignName("【shiqihao.xyz~】", "493566a5ccda4a706ac1369f1be363b3"))
  println(sendSingleMessage("3288962", "493566a5ccda4a706ac1369f1be363b3", "15968912980", List("sqh")))
  //println(getTemplateParams("【shiqihao.xyz】欢迎#username#访问!年龄#age#."))
}
