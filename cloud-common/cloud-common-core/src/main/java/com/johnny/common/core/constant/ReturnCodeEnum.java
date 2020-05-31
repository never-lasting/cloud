package com.johnny.common.core.constant;

public enum ReturnCodeEnum {
    SUCCESS("200", "成功"),
    FAIL("-1", "失败"),
    SERVER_ERROR("500", "服务器繁忙，请稍后重试"),
    PARAM_VALIDATE_DENY("100001", "请求参数不通过")
    ;

    private final String code;
    private final String message;



    ReturnCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode(){
        return code;
    }

    public String getMessage(){
        return message;
    }
}
