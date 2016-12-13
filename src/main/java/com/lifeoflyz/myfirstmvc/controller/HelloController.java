package com.lifeoflyz.myfirstmvc.controller;

import com.lifeoflyz.myfirstmvc.model.User;
import com.lifeoflyz.myfirstmvc.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

/**
 * Created by liyuanzhe on 16-12-11.
 */

@Controller
public class HelloController {

    @Autowired
    UserServiceImpl userService;

    @RequestMapping(value="ping")
    @ResponseBody   // 表明return的值将放入ResponseBody中
    public String ping(){
        return "pong";
    }

    @RequestMapping(value="baseType")
    @ResponseBody
    // defaultValue的用处：当参数不传时的默认值
    public String baseType(@RequestParam(value = "age", defaultValue = "15") int age){
        return "age " + age;
    }

    // http://localhost:8181/array?ages=1&ages=2
    @RequestMapping(value="array")
    @ResponseBody
    public String array(Integer[] ages){
        return "ages " + Arrays.toString(ages);
    }

    // http://localhost:8181/object?name=liyuanzhe&age=10
    @RequestMapping(value="object")
    @ResponseBody
    public String object(User user){
        return "user " + user.toString();
    }

    // http://localhost:8181/list?name=tom&age=10&numList=1,2,3
    // list只能包在对象里面，将list直接作为参数将无法传入
    @RequestMapping(value="list")
    @ResponseBody
    public String list(User user){
        return "user " + user.toString();
    }

    @RequestMapping(value="searchByName")
    @ResponseBody
    public String list(String name ){
        userService.searchUser(name);
        return "user " + userService.searchUser(name);
    }
}
