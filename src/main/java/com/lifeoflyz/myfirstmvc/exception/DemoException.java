package com.lifeoflyz.myfirstmvc.exception;

/**
 * Created by liyuanzhe on 17-2-15.
 */
public enum DemoException {

    SERVICE_FAIL(001, "服务失败");

    public int code;

    public String message;

    DemoException(int code, String message){
        this.code = code;
        this.message = message;
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
}
