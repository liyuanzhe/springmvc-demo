package com.lifeoflyz.myfirstmvc.controller;

import com.google.gson.Gson;
import com.lifeoflyz.myfirstmvc.model.gen.School;
import com.lifeoflyz.myfirstmvc.model.gen.SchoolExample;
import com.lifeoflyz.myfirstmvc.model.gen.SchoolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liyuanzhe on 17-3-6.
 */
@Controller
@RequestMapping("school")
public class SchoolController {

    private Gson gson = new Gson();

    @Autowired
    SchoolMapper schoolMapper;

    @RequestMapping(value="all",produces = "application/json; charset=utf-8")
    @ResponseBody   // 表明return的值将放入ResponseBody中
    public String getSchool(){
        List<School> schoolList = schoolMapper.selectByExample(new SchoolExample());
        return gson.toJson(schoolList);
    }
}
