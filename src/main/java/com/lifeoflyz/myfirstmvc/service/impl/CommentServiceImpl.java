package com.lifeoflyz.myfirstmvc.service.impl;

import com.lifeoflyz.myfirstmvc.model.gen.Comment;
import com.lifeoflyz.myfirstmvc.model.gen.CommentExample;
import com.lifeoflyz.myfirstmvc.model.gen.CommentMapper;
import com.lifeoflyz.myfirstmvc.model.gen.Teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liyuanzhe on 17-3-29.
 */
@Service
public class CommentServiceImpl {

    @Autowired
    CommentMapper commentMapper;

    public void insert(Comment comment){
        commentMapper.insertSelective(comment);
    }

    public List<Comment> list(Integer teacherId){
        CommentExample example = new CommentExample();
        example.or().andTeacherIdEqualTo(teacherId);
        return commentMapper.selectByExample(example);
    }
}
