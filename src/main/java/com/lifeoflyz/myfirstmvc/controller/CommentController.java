package com.lifeoflyz.myfirstmvc.controller;

import com.google.gson.Gson;

import com.lifeoflyz.myfirstmvc.model.gen.Comment;
import com.lifeoflyz.myfirstmvc.model.gen.School;
import com.lifeoflyz.myfirstmvc.model.gen.Teacher;
import com.lifeoflyz.myfirstmvc.service.impl.CommentServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by liyuanzhe on 17-3-29.
 */
@Controller
@RequestMapping("comment")
public class CommentController {

    @Autowired
    CommentServiceImpl commentService;

    private Gson gson = new Gson();

    @RequestMapping(value="insert.do", method= RequestMethod.POST)
    @ResponseBody
    public void insert(Comment comment){
        commentService.insert(comment);
    }

    @RequestMapping(value="list.do",produces = "application/json; charset=utf-8")
    @ResponseBody   // 表明return的值将放入ResponseBody中
    public String getByTeacherId(Integer teacherId){
        return gson.toJson(commentService.list(teacherId));
    }
}
