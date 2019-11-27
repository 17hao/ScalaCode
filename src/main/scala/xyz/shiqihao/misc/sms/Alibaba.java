package xyz.shiqihao.misc.sms;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

public class Alibaba {
    public static void main(String[] args) {
        queryTemplate();
        sendMsg();
    }

    private static void queryTemplate() {
        DefaultProfile profile = DefaultProfile.getProfile("default", "id", "secret");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.GET);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("QuerySmsTemplate");
        request.putQueryParameter("TemplateCode", "code");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }

    private static void sendMsg() {

    }
}
