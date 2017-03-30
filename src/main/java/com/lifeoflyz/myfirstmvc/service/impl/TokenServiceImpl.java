package com.lifeoflyz.myfirstmvc.service.impl;

import com.lifeoflyz.myfirstmvc.util.Md5Generator;

import org.springframework.stereotype.Service;

/**
 * Created by liyuanzhe on 17-3-30.
 */
@Service
public class TokenServiceImpl {

    public String generateToken(String source){
        String md = Md5Generator.generate(source);
        String uuid = java.util.UUID.randomUUID().toString().replaceAll("-","");
        return md + uuid;
    }

    public static void main(String[] args){
        System.out.println(
                new TokenServiceImpl().generateToken("23")
        );
    }
}
