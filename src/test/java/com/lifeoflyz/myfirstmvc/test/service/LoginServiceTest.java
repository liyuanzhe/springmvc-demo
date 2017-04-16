package com.lifeoflyz.myfirstmvc.test.service;

import com.lifeoflyz.myfirstmvc.model.LoginMsg;
import com.lifeoflyz.myfirstmvc.service.impl.LoginServiceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;

/**
 * Created by liyuanzhe on 17-3-30.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:springmvc-config.xml" })
public class LoginServiceTest {

    @Autowired
    LoginServiceImpl loginService;

    @Test
    public void testLogin() throws ParseException {
        LoginMsg loginMsg = new LoginMsg("lee@sjtu.edu.cn", "4052", "阿哲" );
        loginService.login(loginMsg);
    }

}
