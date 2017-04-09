package com.lifeoflyz.myfirstmvc.dao;

import com.lifeoflyz.myfirstmvc.model.gen.User;
import com.lifeoflyz.myfirstmvc.model.gen.UserExample;
import com.lifeoflyz.myfirstmvc.model.gen.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by liyuanzhe on 17-3-30.
 */
@Service
public class UserDao {

    @Autowired
    UserMapper userMapper;

    public User getByEmail(String email){
        UserExample example = new UserExample();
        example.or().andEmailEqualTo(email);
        List<User> userList = userMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(userList))
            return null;
        else
            return userList.get(0);
    }

    public void insert(User user){
        userMapper.insertSelective(user);
    }

    public void update(User user){
        userMapper.updateByPrimaryKeySelective(user);
    }

    public void updateByEmail(User user){
        UserExample example = new UserExample();
        example.or().andEmailEqualTo(user.getEmail());
        userMapper.updateByExampleSelective(user, example);
    }

}
