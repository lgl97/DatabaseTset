package com.po;

import java.util.Date;


public class UserPo {
    private String name;
    private int age;
    private Date create_data;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCreate_data(Date create_data) {
        this.create_data = create_data;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getCreate_data() {
        return create_data;
    }

}
