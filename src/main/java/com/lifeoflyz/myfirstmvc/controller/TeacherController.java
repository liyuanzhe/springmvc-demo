package com.lifeoflyz.myfirstmvc.controller;

import com.google.gson.Gson;

import com.lifeoflyz.myfirstmvc.model.gen.School;
import com.lifeoflyz.myfirstmvc.model.gen.Teacher;
import com.lifeoflyz.myfirstmvc.service.impl.TeacherServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by liyuanzhe on 17-3-28.
 */
@Controller
@RequestMapping("teacher")
public class TeacherController {

    @Autowired
    TeacherServiceImpl teacherService;

    private Gson gson = new Gson();

    @RequestMapping(value="getByDepartmentId.do",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String getByDepartmentId(Integer departmentId){
        List<Teacher> teacherList = teacherService.getByDepartmentId(departmentId);
        return gson.toJson(teacherList);
    }

    @RequestMapping(value="update.do", method= RequestMethod.POST)
    @ResponseBody
    public void update(Teacher teacher){
        teacherService.update(teacher);
    }

    @RequestMapping(value="insert.do", method= RequestMethod.POST)
    @ResponseBody
    public void insert(Teacher teacher){
        teacherService.insert(teacher);
    }

    @RequestMapping(value="delete.do", method= RequestMethod.GET)
    @ResponseBody
    public void delete(HttpServletRequest request, Integer id){
        request.getCookies();
        teacherService.delete(id);
    }

}
