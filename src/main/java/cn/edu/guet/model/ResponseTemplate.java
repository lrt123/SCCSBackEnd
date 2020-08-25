package cn.edu.guet.model;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;

public class ResponseTemplate implements Serializable {
    private int code;
    private String message;
    private Object data;

    public static ResponseTemplate success(Object data) {
        return success(200,"操作成功",data);
    }

    public static ResponseTemplate success(int code, String msg, Object data) {
        ResponseTemplate responseTemplate = new ResponseTemplate();
        responseTemplate.setCode(code);
        responseTemplate.setMessage(msg);
        responseTemplate.setData(data);
        return responseTemplate;
    }

    public static ResponseTemplate fail(Object data) {
        return success(401,"操作失败",data);
    }
    public static ResponseTemplate fail(int code, String msg, Object data){
        ResponseTemplate responseTemplate = new ResponseTemplate();
        responseTemplate.setCode(code);
        responseTemplate.setMessage(msg);
        responseTemplate.setData(data);
        return responseTemplate;
    }

    public static ResponseTemplate result(int code, String msg, Object data){
        ResponseTemplate responseTemplate = new ResponseTemplate();
        responseTemplate.setCode(code);
        responseTemplate.setMessage(msg);
        responseTemplate.setData(data);
        return responseTemplate;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
