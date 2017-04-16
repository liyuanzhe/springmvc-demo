package com.lifeoflyz.myfirstmvc.model.gen;

import com.lifeoflyz.myfirstmvc.model.gen.School;
import com.lifeoflyz.myfirstmvc.model.gen.SchoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchoolMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_school
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    int countByExample(SchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_school
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    int deleteByExample(SchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_school
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_school
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    int insert(School record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_school
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    int insertSelective(School record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_school
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    List<School> selectByExample(SchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_school
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    School selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_school
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    int updateByExampleSelective(@Param("record") School record, @Param("example") SchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_school
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    int updateByExample(@Param("record") School record, @Param("example") SchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_school
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    int updateByPrimaryKeySelective(School record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_school
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    int updateByPrimaryKey(School record);
}