package com.lifeoflyz.myfirstmvc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liyuanzhe on 16-12-11.
 */

@Controller
public class HelloController {

    @RequestMapping("ping")
    public ResponseEntity<?> ping(){
        System.out.println("pong");
        return ResponseEntity.ok("pong");
    }
}
