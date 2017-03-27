package com.lifeoflyz.myfirstmvc.controller;

import com.google.gson.Gson;
import com.lifeoflyz.myfirstmvc.model.gen.School;
import com.lifeoflyz.myfirstmvc.model.gen.SchoolExample;
import com.lifeoflyz.myfirstmvc.model.gen.SchoolMapper;
import com.lifeoflyz.myfirstmvc.service.impl.SchoolServiceImpl;
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

    @Autowired
    SchoolServiceImpl schoolService;

    @RequestMapping(value="all.do",produces = "application/json; charset=utf-8")
    @ResponseBody   // 表明return的值将放入ResponseBody中
    public String getSchool(){
        List<School> schoolList = schoolService.getSchoolList();
        return gson.toJson(schoolList);
    }
}
