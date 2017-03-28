package com.lifeoflyz.myfirstmvc.service.impl;

import com.lifeoflyz.myfirstmvc.model.gen.School;
import com.lifeoflyz.myfirstmvc.model.gen.SchoolExample;
import com.lifeoflyz.myfirstmvc.model.gen.SchoolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liyuanzhe on 17-3-6.
 */
@Service
public class SchoolServiceImpl {

    @Autowired
    SchoolMapper schoolMapper;

    public void insertSchool(School school){
        schoolMapper.insert(school);
    }

    public List<School> getSchoolList(){
        return schoolMapper.selectByExample(new SchoolExample());
    }

    public void update(School school){
        schoolMapper.updateByPrimaryKeySelective(school);
    }

    public void delete(Integer id){
        schoolMapper.deleteByPrimaryKey(id);
    }
}
