package com.panyu.panyuprojectims.utils;

//http请求返回的对象
public class Result<T> {
    private String status;//响应状态编码
    private String message;//响应信息
    private T data;//返回成功信息

    private Result(){
        //单例
    }
    private static final Result ME = new Result();
    private static Result  getInstance(){

        return ME;
    }

    public Result(String status, String message) {
        this.status = status;
        this.message = message;

    }
    public Result(String status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static Result getME() {
        return ME;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
