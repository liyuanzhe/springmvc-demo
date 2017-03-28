package com.lifeoflyz.myfirstmvc.controller;

import com.google.gson.Gson;

import com.lifeoflyz.myfirstmvc.model.gen.School;
import com.lifeoflyz.myfirstmvc.model.gen.SchoolMapper;
import com.lifeoflyz.myfirstmvc.service.impl.SchoolServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    @RequestMapping(value="update.do", method= RequestMethod.POST)
    @ResponseBody   // 表明return的值将放入ResponseBody中
    public void update(School school){
        schoolService.update(school);
    }

    @RequestMapping(value="insert.do", method= RequestMethod.POST)
    @ResponseBody   // 表明return的值将放入ResponseBody中
    public void insert(School school){
        schoolService.insertSchool(school);
    }

    @RequestMapping(value="delete.do", method= RequestMethod.GET)
    @ResponseBody   // 表明return的值将放入ResponseBody中
    public void insert(Integer id){
        schoolService.delete(id);
    }
}
