package com.lifeoflyz.myfirstmvc.service.impl;

import com.lifeoflyz.myfirstmvc.model.gen.Teacher;
import com.lifeoflyz.myfirstmvc.model.gen.TeacherExample;
import com.lifeoflyz.myfirstmvc.model.gen.TeacherMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liyuanzhe on 17-3-28.
 */
@Service
public class TeacherServiceImpl {

    @Autowired
    TeacherMapper teacherMapper;

    public List<Teacher> getByDepartmentId(Integer departmentId){
        TeacherExample example = new TeacherExample();
        example.or().andDepartmentidEqualTo(departmentId);
        return teacherMapper.selectByExample(example);
    }

    public void update(Teacher teacher){
        teacherMapper.updateByPrimaryKeySelective(teacher);
    }

    public void insert(Teacher teacher){
        teacherMapper.insertSelective(teacher);
    }

    public void delete(Integer id){
        teacherMapper.deleteByPrimaryKey(id);
    }
}
