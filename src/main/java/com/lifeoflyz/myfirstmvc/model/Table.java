package com.lifeoflyz.myfirstmvc.model;

/**
 * Created by liyuanzhe on 17-3-4.
 */
public class Table {

    Integer id;

    String name;

    public Table(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
