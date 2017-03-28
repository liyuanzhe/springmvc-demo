package com.lifeoflyz.myfirstmvc.service.impl;

import com.lifeoflyz.myfirstmvc.model.gen.Department;
import com.lifeoflyz.myfirstmvc.model.gen.DepartmentExample;
import com.lifeoflyz.myfirstmvc.model.gen.DepartmentMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liyuanzhe on 17-3-28.
 */
@Service
public class DepartmentServiceImpl {

    @Autowired
    DepartmentMapper departmentMapper;

    public void insertDepartment(Department department){
        departmentMapper.insertSelective(department);
    }

    public List<Department> getDepartmentBySchoolId(Integer schoolId){
        DepartmentExample example = new DepartmentExample();
        example.or().andSchoolIdEqualTo(schoolId);
        return departmentMapper.selectByExample(example);
    }

    public void update(Department department){
        departmentMapper.updateByPrimaryKey(department);
    }

    public void delete(Integer id){
        departmentMapper.deleteByPrimaryKey(id);
    }

}
