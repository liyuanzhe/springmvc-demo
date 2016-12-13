package com.lifeoflyz.myfirstmvc.service.impl;

import com.lifeoflyz.myfirstmvc.model.gen.UserExample;
import com.lifeoflyz.myfirstmvc.model.gen.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liyuanzhe on 16-12-14.
 */
@Service
public class UserServiceImpl {

    @Autowired
    UserMapper userMapper;

    public String searchUser(String name){

//        UserExample userExample = new UserExample();
//        userExample.or().andNameEqualTo(name);
//        String result = userMapper.selectByExample(userExample).get(0).getName();
//        System.out.println(result);

//        return result;

        return "over";
    }

}
