package com.quickbus.demo.model;

public class ResponseModel {
    int code;
    String desc;

    public ResponseModel(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public ResponseModel() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
