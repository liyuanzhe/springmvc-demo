package com.lifeoflyz.myfirstmvc.model;

import java.util.List;

/**
 * Created by liyuanzhe on 16-12-12.
 */
public class MyUser {

    private String name;
    private Integer age;
    private List<Integer> numList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Integer> getNumList() {
        return numList;
    }

    public void setNumList(List<Integer> numList) {
        this.numList = numList;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", numList=" + numList +
                '}';
    }
}
