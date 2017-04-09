package com.lifeoflyz.myfirstmvc.mail;

import java.util.Random;

/**
 * Created by liyuanzhe on 17-4-9.
 */
public class MainUtil {

    /**
     * 生成邮箱验证码
     * @return
     */
    public static int generateCode(){
        Random rand = new Random();
        return 1000 + rand.nextInt(8999);
    }

    public static void main(String[] args){
        for(int i=0; i<10; i++){
            System.out.println(generateCode());
        }
    }
}
