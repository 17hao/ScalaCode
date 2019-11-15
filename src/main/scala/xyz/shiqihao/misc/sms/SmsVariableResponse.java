package xyz.shiqihao.misc.sms;

public class SmsVariableResponse {
    /**
     * 响应时间
     */
    private final String time;

    /**
     * 消息id
     */
    private final  String msgId;

    /**
     * 状态码说明（成功返回空）
     */
    private final String errorMsg;

    /**
     * 失败的个数
     */
    private final String failNum;

    /**
     * 成功的个数
     */
    private final String successNum;

    /**
     * 状态码（详细参考提交响应状态码）
     */
    private final String code;


    public SmsVariableResponse(String time, String msgId, String errorMsg, String failNum, String successNum, String code) {
        this.time = time;
        this.msgId = msgId;
        this.errorMsg = errorMsg;
        this.failNum = failNum;
        this.successNum = successNum;
        this.code = code;
    }

    public String time() {
        return time;
    }

    public String msgId() {
        return msgId;
    }

    public String errorMsg() {
        return errorMsg;
    }

    public String failNum() {
        return failNum;
    }

    public String successNum() {
        return successNum;
    }

    public String code() {
        return code;
    }
}
