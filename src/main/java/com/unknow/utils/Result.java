package com.unknow.utils;

/**
 * Created by Administrator on 2017/4/16 0016.
 */
public class Result {
    private Boolean success;
    private String massage;
    private Object data;

    public Result(Boolean success, String massage, Object data) {
        this.success = success;
        this.massage = massage;
        this.data = data;
    }

    public Result(Boolean success, String massage) {
        this.success = success;
        this.massage = massage;
    }

    public Result(Boolean success, Object data) {
        this.success = success;
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
