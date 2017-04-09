package com.lifeoflyz.myfirstmvc.util;

/**
 * Created by liyuanzhe on 17-3-30.
 */
public class TokenUtil {

    public static String generateToken(String source){
        String md = Md5Generator.generate(source);
        String uuid = java.util.UUID.randomUUID().toString().replaceAll("-","");
        return md + uuid;
    }

    public static void main(String[] args){
        System.out.println(
                new TokenUtil().generateToken("23")
        );
    }
}
