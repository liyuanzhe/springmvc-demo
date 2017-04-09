package com.lifeoflyz.myfirstmvc.model.gen;

import com.lifeoflyz.myfirstmvc.model.gen.Agree;
import com.lifeoflyz.myfirstmvc.model.gen.AgreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgreeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_agree
     *
     * @mbggenerated Sun Apr 09 20:15:53 CST 2017
     */
    int countByExample(AgreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_agree
     *
     * @mbggenerated Sun Apr 09 20:15:53 CST 2017
     */
    int deleteByExample(AgreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_agree
     *
     * @mbggenerated Sun Apr 09 20:15:53 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_agree
     *
     * @mbggenerated Sun Apr 09 20:15:53 CST 2017
     */
    int insert(Agree record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_agree
     *
     * @mbggenerated Sun Apr 09 20:15:53 CST 2017
     */
    int insertSelective(Agree record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_agree
     *
     * @mbggenerated Sun Apr 09 20:15:53 CST 2017
     */
    List<Agree> selectByExample(AgreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_agree
     *
     * @mbggenerated Sun Apr 09 20:15:53 CST 2017
     */
    Agree selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_agree
     *
     * @mbggenerated Sun Apr 09 20:15:53 CST 2017
     */
    int updateByExampleSelective(@Param("record") Agree record, @Param("example") AgreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_agree
     *
     * @mbggenerated Sun Apr 09 20:15:53 CST 2017
     */
    int updateByExample(@Param("record") Agree record, @Param("example") AgreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_agree
     *
     * @mbggenerated Sun Apr 09 20:15:53 CST 2017
     */
    int updateByPrimaryKeySelective(Agree record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_agree
     *
     * @mbggenerated Sun Apr 09 20:15:53 CST 2017
     */
    int updateByPrimaryKey(Agree record);
}