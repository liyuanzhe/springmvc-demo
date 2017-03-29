package com.lifeoflyz.myfirstmvc.model.gen;

import com.lifeoflyz.myfirstmvc.model.gen.Comment;
import com.lifeoflyz.myfirstmvc.model.gen.CommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_comment
     *
     * @mbggenerated Wed Mar 29 15:30:00 CST 2017
     */
    int countByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_comment
     *
     * @mbggenerated Wed Mar 29 15:30:00 CST 2017
     */
    int deleteByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_comment
     *
     * @mbggenerated Wed Mar 29 15:30:00 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_comment
     *
     * @mbggenerated Wed Mar 29 15:30:00 CST 2017
     */
    int insert(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_comment
     *
     * @mbggenerated Wed Mar 29 15:30:00 CST 2017
     */
    int insertSelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_comment
     *
     * @mbggenerated Wed Mar 29 15:30:00 CST 2017
     */
    List<Comment> selectByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_comment
     *
     * @mbggenerated Wed Mar 29 15:30:00 CST 2017
     */
    Comment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_comment
     *
     * @mbggenerated Wed Mar 29 15:30:00 CST 2017
     */
    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_comment
     *
     * @mbggenerated Wed Mar 29 15:30:00 CST 2017
     */
    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_comment
     *
     * @mbggenerated Wed Mar 29 15:30:00 CST 2017
     */
    int updateByPrimaryKeySelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_comment
     *
     * @mbggenerated Wed Mar 29 15:30:00 CST 2017
     */
    int updateByPrimaryKey(Comment record);
}