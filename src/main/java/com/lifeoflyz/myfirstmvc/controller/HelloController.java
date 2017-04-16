package com.lifeoflyz.myfirstmvc.controller;

import com.google.gson.Gson;
import com.lifeoflyz.myfirstmvc.model.MyUser;
import com.lifeoflyz.myfirstmvc.model.Table;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liyuanzhe on 16-12-11.
 */

@Controller
public class HelloController {

    private Gson gson = new Gson();

    @RequestMapping(value = "ping.do")
    @ResponseBody   // 表明return的值将放入ResponseBody中
    public String ping() {
        Map<String, String> myMap = new HashMap();
        myMap.put("data", "hello");
        return gson.toJson(myMap);
    }

    @RequestMapping(value = "baseType.do")
    @ResponseBody
    // defaultValue的用处：当参数不传时的默认值
    public String baseType(@RequestParam(value = "age") int age) {
        return "age " + age;
    }

    // http://localhost:8181/array?ages=1&ages=2
    @RequestMapping(value = "array")
    @ResponseBody
    public String array(Integer[] ages) {
        return "ages " + Arrays.toString(ages);
    }

    // http://localhost:8181/object?name=liyuanzhe&age=10
    @RequestMapping(value = "object")
    @ResponseBody
    public String object(MyUser user) {
        return "user " + user.toString();
    }

    // http://localhost:8181/list?name=tom&age=10&numList=1,2,3
    // list只能包在对象里面，将list直接作为参数将无法传入
    @RequestMapping(value="list")
    @ResponseBody
    public String list(MyUser user){
        return "user " + user.toString();
    }

    @RequestMapping(value="table" ,produces = "application/json; charset=utf-8")
    @ResponseBody
    public String table(){
        List<Table> tableList = new LinkedList();
        tableList.add(new Table(1, "张三"));
        tableList.add(new Table(2, "李四"));
        tableList.add(new Table(3, "王五"));
        return gson.toJson(tableList);
    }

    @RequestMapping(value="cookie.do" ,produces = "application/json; charset=utf-8")
    @ResponseBody
    public String cookie(HttpServletRequest request, HttpServletResponse response){

        Cookie[] cookies = request.getCookies();
        if (null==cookies) {
            System.out.println("没有cookie=========");
        } else {
            for(Cookie cookie : cookies){
                System.out.println("name:"+cookie.getName()+",value:"+ cookie.getValue());
            }
        }

        Cookie cookie = new Cookie("test", "value");
        cookie.setMaxAge(60);
        cookie.setPath("/");
        response.addCookie(cookie);
        return gson.toJson("");
    }

}
