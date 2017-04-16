package com.lifeoflyz.myfirstmvc.service.impl;

import com.lifeoflyz.myfirstmvc.dao.UserDao;
import com.lifeoflyz.myfirstmvc.model.LoginMsg;
import com.lifeoflyz.myfirstmvc.model.gen.User;
import com.lifeoflyz.myfirstmvc.util.TokenUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by liyuanzhe on 17-4-9.
 */
@Service
public class UserServiceImpl {

    @Autowired
    UserDao userDao;

    /**
     * 根据邮箱将验证码存入数据库
     * @param email
     * @param code
     */
    public void refreshCode(String email, String code){

        User result = userDao.getByEmail(email);

        if(result == null){
            // 新建用户
            createUserByMailAndCode(email, code);
        } else {
            // 更新验证码
            User user = new User();
            user.setEmail(email);
            user.setCode(code);
            user.setCodeUpdatedAt(new Date());
            userDao.updateByEmail(user);
        }
    }

    private void createUserByMailAndCode(String email, String code){
        User user = new User();
        user.setEmail(email);
        user.setCode(code);
        user.setCodeUpdatedAt(new Date());
        userDao.insert(user);
    }

    /**
     * 生成并保存token
     * @param
     * @return
     */
    public String updateToken(String email){
        String token = TokenUtil.generateToken(email);
        User user = new User();
        user.setEmail(email);
        user.setToken(token);
        user.setTokenUpdatedAt(new Date());
        userDao.updateByEmail(user);
        return token;
    }


}
