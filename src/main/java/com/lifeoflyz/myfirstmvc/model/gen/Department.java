package com.lifeoflyz.myfirstmvc.model.gen;

public class Department {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_department.id
     *
     * @mbggenerated Thu Mar 30 20:26:58 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_department.name
     *
     * @mbggenerated Thu Mar 30 20:26:58 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_department.short_name
     *
     * @mbggenerated Thu Mar 30 20:26:58 CST 2017
     */
    private String shortName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_department.school_id
     *
     * @mbggenerated Thu Mar 30 20:26:58 CST 2017
     */
    private Integer schoolId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_department.id
     *
     * @return the value of tb_department.id
     *
     * @mbggenerated Thu Mar 30 20:26:58 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_department.id
     *
     * @param id the value for tb_department.id
     *
     * @mbggenerated Thu Mar 30 20:26:58 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_department.name
     *
     * @return the value of tb_department.name
     *
     * @mbggenerated Thu Mar 30 20:26:58 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_department.name
     *
     * @param name the value for tb_department.name
     *
     * @mbggenerated Thu Mar 30 20:26:58 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_department.short_name
     *
     * @return the value of tb_department.short_name
     *
     * @mbggenerated Thu Mar 30 20:26:58 CST 2017
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_department.short_name
     *
     * @param shortName the value for tb_department.short_name
     *
     * @mbggenerated Thu Mar 30 20:26:58 CST 2017
     */
    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_department.school_id
     *
     * @return the value of tb_department.school_id
     *
     * @mbggenerated Thu Mar 30 20:26:58 CST 2017
     */
    public Integer getSchoolId() {
        return schoolId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_department.school_id
     *
     * @param schoolId the value for tb_department.school_id
     *
     * @mbggenerated Thu Mar 30 20:26:58 CST 2017
     */
    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }
}