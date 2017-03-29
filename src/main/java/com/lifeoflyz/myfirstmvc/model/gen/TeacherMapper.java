package com.lifeoflyz.myfirstmvc.model.gen;

import com.lifeoflyz.myfirstmvc.model.gen.Teacher;
import com.lifeoflyz.myfirstmvc.model.gen.TeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_teacher
     *
     * @mbggenerated Wed Mar 29 15:30:00 CST 2017
     */
    int countByExample(TeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_teacher
     *
     * @mbggenerated Wed Mar 29 15:30:00 CST 2017
     */
    int deleteByExample(TeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_teacher
     *
     * @mbggenerated Wed Mar 29 15:30:00 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_teacher
     *
     * @mbggenerated Wed Mar 29 15:30:00 CST 2017
     */
    int insert(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_teacher
     *
     * @mbggenerated Wed Mar 29 15:30:00 CST 2017
     */
    int insertSelective(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_teacher
     *
     * @mbggenerated Wed Mar 29 15:30:00 CST 2017
     */
    List<Teacher> selectByExample(TeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_teacher
     *
     * @mbggenerated Wed Mar 29 15:30:00 CST 2017
     */
    Teacher selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_teacher
     *
     * @mbggenerated Wed Mar 29 15:30:00 CST 2017
     */
    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_teacher
     *
     * @mbggenerated Wed Mar 29 15:30:00 CST 2017
     */
    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_teacher
     *
     * @mbggenerated Wed Mar 29 15:30:00 CST 2017
     */
    int updateByPrimaryKeySelective(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_teacher
     *
     * @mbggenerated Wed Mar 29 15:30:00 CST 2017
     */
    int updateByPrimaryKey(Teacher record);
}