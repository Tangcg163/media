package com.media.api;

public enum ApiCode {

    SUCCESS(200, "操作成功"),

    RUNNING_EXCEPTION(400,"运行时异常!"),

    UNAUTHORIZED(401, "需要登录"),

    NOT_PERMISSION(403, "没有权限"),

    NOT_FOUND(404, "你请求的路径不存在"),

    REQUEST_TIMEOUT(408,"请求超时"),

    ACCOUNT_ALREADY_EXIST(409, "用户已经存在"),

    SYSTEM_EXCEPTION(500,"系统异常!"),

    PARAMETER_EXCEPTION(50001,"请求参数校验异常"),

    PARAMETER_PARSE_EXCEPTION(50002,"请求参数解析异常"),

    HTTP_MEDIA_TYPE_EXCEPTION(50003,"HTTP Media 类型异常"),

    SYSTEM_LOGIN_EXCEPTION(50004,"系统登录异常"),

    FAIL(501, "操作失败"),

    FAILED(503, "联调制造云操作失败"),

    SMS_CODE(505,"验证码错误"),

    WITHDRAWALFAIL(400001,"提现失败"),

    /* 开放API */
    API_REQUEST_EXCEPTION(60001,"接口请求错误"),

    API_TIMEOUT_EXCEPTION(60002,"接口超时失效"),

    API_SIGNATURE_EXCEPTION(60003,"接口签名错误"),

    API_APPKEY_EXCEPTION(60004, "无效的appkey"),
    ;

    private final int code;
    private final String msg;

    ApiCode(final int code, final String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ApiCode getApiCode(int code) {
        ApiCode[] ecs = ApiCode.values();
        for (ApiCode ec : ecs) {
            if (ec.getCode() == code) {
                return ec;
            }
        }
        return SUCCESS;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
