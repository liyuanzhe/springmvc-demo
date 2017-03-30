package com.lifeoflyz.myfirstmvc.model;

import org.springframework.util.StringUtils;

/**
 * Created by liyuanzhe on 17-3-30.
 */
public class LoginMsg {

    // 邮箱
    private String email;

    // 邮箱验证码
    private String code;

    // 姓名
    private String name;

    public boolean isEmpty(){
        if(StringUtils.isEmpty(email) || StringUtils.isEmpty(code))
            return true;
        else
            return false;
    }

    public boolean isValidate(){
    return !this.isEmpty();
    }

    public LoginMsg(String email, String code, String name) {
        this.email = email;
        this.code = code;
        this.name = name;
    }

    /**
     * getter & setter
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
