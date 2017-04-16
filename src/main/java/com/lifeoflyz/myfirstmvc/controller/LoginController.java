package com.lifeoflyz.myfirstmvc.controller;

import com.google.gson.Gson;

import com.lifeoflyz.myfirstmvc.model.LoginMsg;
import com.lifeoflyz.myfirstmvc.service.impl.LoginServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;

/**
 * Created by liyuanzhe on 17-4-16.
 */
@Controller
@RequestMapping("login")
public class LoginController {

    private Gson gson = new Gson();

    @Autowired
    private LoginServiceImpl loginService;

    @RequestMapping(value="check_token.do",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String checkToken(String token, String email){

        boolean isValid = loginService.checkToken(email, token);

        return gson.toJson(isValid);
    }

    @RequestMapping(value="check_code.do",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String checkCode(String email, String code) throws ParseException {

        String token = loginService.login(new LoginMsg(email, code, ""));

        return gson.toJson(token);
    }

    @RequestMapping(value="send_code.do",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String sendCode(String email){

        loginService.generateCode(new LoginMsg(email, "", ""));

        return gson.toJson("");
    }

}
