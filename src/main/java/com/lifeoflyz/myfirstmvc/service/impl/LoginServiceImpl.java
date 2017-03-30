package com.lifeoflyz.myfirstmvc.service.impl;

import com.lifeoflyz.myfirstmvc.dao.UserDao;
import com.lifeoflyz.myfirstmvc.model.LoginMsg;
import com.lifeoflyz.myfirstmvc.model.gen.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;

/**
 * Created by liyuanzhe on 17-3-30.
 */
@Service
public class LoginServiceImpl {

    @Autowired
    UserDao userDao;

    @Autowired
    TokenServiceImpl tokenService;

    /**
     * 登录或注册
     * @param loginMsg
     * @return
     */
    public String login(LoginMsg loginMsg){

       if(loginMsg == null || !loginMsg.isValidate()) return null;

        User user = userDao.getByEmail(loginMsg.getEmail());
        if(user == null){
            // 注册
            return register(loginMsg);
        }else{
            // 登录
            return doLogin(user);
        }
    }

    /**
     * 登录
     * @param user
     * @return
     */
    private String doLogin(User user){
        String token = tokenService.generateToken(user.getEmail());
        user.setToken(token);
        user.setTokenUpdatedAt(new Date());
        userDao.update(user);
        return token;
    }

    /**
     * 注册
     * @param loginMsg
     * @return
     */
    private String register(LoginMsg loginMsg){
        User user = new User();
        user.setEmail(loginMsg.getEmail());

        // 生成token
        String token = tokenService.generateToken(loginMsg.getEmail());
        user.setToken(token);
        user.setTokenUpdatedAt(new Date());

        // 设置名称
        String name = StringUtils.isEmpty(loginMsg.getName()) ? loginMsg.getEmail() : loginMsg.getName();
        user.setName(name);

        // 添加到数据库
        userDao.insert(user);

        return token;
    }
}
