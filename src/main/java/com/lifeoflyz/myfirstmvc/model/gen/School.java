package com.lifeoflyz.myfirstmvc.model.gen;

public class School {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_school.id
     *
     * @mbggenerated Mon Mar 06 22:07:50 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_school.name
     *
     * @mbggenerated Mon Mar 06 22:07:50 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_school.short_name
     *
     * @mbggenerated Mon Mar 06 22:07:50 CST 2017
     */
    private String shortName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_school.id
     *
     * @return the value of tb_school.id
     *
     * @mbggenerated Mon Mar 06 22:07:50 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_school.id
     *
     * @param id the value for tb_school.id
     *
     * @mbggenerated Mon Mar 06 22:07:50 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_school.name
     *
     * @return the value of tb_school.name
     *
     * @mbggenerated Mon Mar 06 22:07:50 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_school.name
     *
     * @param name the value for tb_school.name
     *
     * @mbggenerated Mon Mar 06 22:07:50 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_school.short_name
     *
     * @return the value of tb_school.short_name
     *
     * @mbggenerated Mon Mar 06 22:07:50 CST 2017
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_school.short_name
     *
     * @param shortName the value for tb_school.short_name
     *
     * @mbggenerated Mon Mar 06 22:07:50 CST 2017
     */
    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }
}