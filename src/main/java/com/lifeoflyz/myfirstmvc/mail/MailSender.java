package com.lifeoflyz.myfirstmvc.mail;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Created by liyuanzhe on 17-4-9.
 */
public class MailSender {

    private static final String MAIL_PASSWORD = "";

    public static void send(Mail mail) throws MessagingException {
        Properties props = new Properties();
        // 开启debug调试
        props.setProperty("mail.debug", "true");
        // 发送服务器需要身份验证
        props.setProperty("mail.smtp.auth", "true");
        // 设置邮件服务器主机名
        props.setProperty("mail.host", "smtp.126.com");
        // 发送邮件协议名称
        props.setProperty("mail.transport.protocol", "smtp");

        // 设置环境信息
        Session session = Session.getInstance(props);

        // 创建邮件对象
        Message msg = new MimeMessage(session);
        msg.setSubject("JavaMail测试");
        // 设置邮件内容
        msg.setText(mail.getContent());
        // 设置发件人
        msg.setFrom(new InternetAddress("superyuanzhe@126.com"));

        Transport transport = session.getTransport();
        // 连接邮件服务器
        transport.connect("superyuanzhe", MAIL_PASSWORD);
        // 发送邮件
        transport.sendMessage(msg, new Address[] {new InternetAddress("lee@sjtu.edu.cn")});
        // 关闭连接
        transport.close();
    }
}
