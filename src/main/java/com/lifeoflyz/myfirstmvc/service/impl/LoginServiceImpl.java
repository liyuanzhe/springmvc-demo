package com.lifeoflyz.myfirstmvc.service.impl;

import com.lifeoflyz.myfirstmvc.dao.UserDao;
import com.lifeoflyz.myfirstmvc.mail.Mail;
import com.lifeoflyz.myfirstmvc.mail.MailSender;
import com.lifeoflyz.myfirstmvc.mail.MainUtil;
import com.lifeoflyz.myfirstmvc.model.LoginMsg;
import com.lifeoflyz.myfirstmvc.model.gen.User;
import com.lifeoflyz.myfirstmvc.util.TokenUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.mail.MessagingException;

/**
 * Created by liyuanzhe on 17-3-30.
 */
@Service
public class LoginServiceImpl {

    @Autowired
    UserDao userDao;

    @Autowired
    UserServiceImpl userService;

    /**
     * 登录或注册
     * @param loginMsg
     * @return
     */
    public String login(LoginMsg loginMsg) throws ParseException {

       if(loginMsg == null || !loginMsg.isValidate()) return null;

       if(StringUtils.isEmpty(loginMsg.getCode())){
           // 发送验证码
           this.generateCode(loginMsg);
           return null;
       }else{
           // 验证身份
           if(this.checkCode(loginMsg)){
               // 验证成功，生成token
               return userService.updateToken(loginMsg.getEmail());
           }else{
               // 验证失败
               return null;
           }

       }
    }


    /**
     * 生成验证码并发送邮件
     * @param loginMsg
     */
    public void generateCode(LoginMsg loginMsg){

        // 发送验证码
        String code = sendMail(loginMsg);

        // 发送失败
        if(code == null) return;

        // 将验证码存入数据库
        userService.refreshCode(loginMsg.getEmail(), code);
    }

    public boolean checkCode(LoginMsg loginMsg) throws ParseException {
        User user = userDao.getByEmail(loginMsg.getEmail());
        if(user == null || user.getCode() == null || user.getCodeUpdatedAt() == null) return false;

        // 验证码失效
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date codeGeneratedTtime = sdf.parse(user.getCodeUpdatedAt());
        if(new Date().compareTo(codeGeneratedTtime) > 60*1000){
            return false;
        }

        if(loginMsg.getCode().equals(user.getCode())){
            return true;
        }

        return false;
    }

    /**
     * 发送验证码
     * @param loginMsg
     * @return
     */
    public String sendMail(LoginMsg loginMsg){

        // 包装邮件
        Mail mail = new Mail("superyuanzhe@126.com", loginMsg.getEmail());
        mail.setSetSubject("验证消息");
        String code = String.valueOf(MainUtil.generateCode());
        mail.setContent(code);

        // 发送邮件
        try {
            MailSender.send(mail);
        } catch (MessagingException e) {
            e.printStackTrace();
            return null;
        }

        return code;
    }
}
