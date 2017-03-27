package com.lifeoflyz.myfirstmvc.service.impl;

import com.lifeoflyz.myfirstmvc.model.gen.School;
import com.lifeoflyz.myfirstmvc.model.gen.SchoolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
