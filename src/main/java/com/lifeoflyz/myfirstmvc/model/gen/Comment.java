package com.lifeoflyz.myfirstmvc.model.gen;

public class Comment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_comment.id
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_comment.teacher_id
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    private Integer teacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_comment.score
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    private Integer score;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_comment.user_id
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_comment.content
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_comment.id
     *
     * @return the value of tb_comment.id
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_comment.id
     *
     * @param id the value for tb_comment.id
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_comment.teacher_id
     *
     * @return the value of tb_comment.teacher_id
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_comment.teacher_id
     *
     * @param teacherId the value for tb_comment.teacher_id
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_comment.score
     *
     * @return the value of tb_comment.score
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_comment.score
     *
     * @param score the value for tb_comment.score
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_comment.user_id
     *
     * @return the value of tb_comment.user_id
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_comment.user_id
     *
     * @param userId the value for tb_comment.user_id
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_comment.content
     *
     * @return the value of tb_comment.content
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_comment.content
     *
     * @param content the value for tb_comment.content
     *
     * @mbggenerated Sun Apr 16 18:14:33 CST 2017
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}