package com.panyu.panyuprojectims.utils;

//  自定义异常枚举类
public enum ExceptionEnum {
    UNKNOW_ERROR(-1,"UnKnowError","未知错误"),
    USER_NOT_FIND(-101,"UserNotFind","用户不存在"),
    BAD_REQUEST(400,"BadRequest","请求有误"),
    FORBIDDEN(403,"Forbidden","权限不足"),
    NOT_FOUND(404,"NotFound","您所访问的资源不存在"),
    SERVER_EPT(500,"ServerEpt","异常操作，请稍后重试");

    private int type;
    private String code;
    private String msg;

    ExceptionEnum(int type, String code, String msg) {
        this.type = type;
        this.code = code;
        this.msg = msg;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
