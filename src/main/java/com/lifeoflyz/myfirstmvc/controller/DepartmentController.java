package com.lifeoflyz.myfirstmvc.controller;

import com.google.gson.Gson;

import com.lifeoflyz.myfirstmvc.model.gen.Department;
import com.lifeoflyz.myfirstmvc.service.impl.DepartmentServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by liyuanzhe on 17-3-28.
 */
@Controller
@RequestMapping("department")
public class DepartmentController {

    @Autowired
    DepartmentServiceImpl departmentService;

    private Gson gson = new Gson();

    @RequestMapping(value="getBySchoolId.do", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String getBySchoolId(Integer schoolId){
        List<Department> departmentList = departmentService.getDepartmentBySchoolId(schoolId);
        return gson.toJson(departmentList);
    }

    @RequestMapping(value="insert.do")
    @ResponseBody
    public String insert(Department department){
        departmentService.insertDepartment(department);
        return gson.toJson("");
    }

    @RequestMapping(value="update.do")
    @ResponseBody
    public void update(Department department){
        departmentService.update(department);
    }

    @RequestMapping(value="delete.do")
    @ResponseBody
    public void delete(Integer id){
        departmentService.delete(id);
    }

}
