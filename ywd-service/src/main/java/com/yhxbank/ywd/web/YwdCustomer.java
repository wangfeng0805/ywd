package com.yhxbank.ywd.web;

/**
 * Created by Administrator on 2016/9/16.
 */
public class YwdCustomer {

    private String name;
    private Integer age;

    public YwdCustomer() {
    }

    public YwdCustomer(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "name=" + name + ", age=" +age;
    }

}
