package com.xzlin.userMag.entity;

import java.math.BigDecimal;

public class User {
    private int id;
    private String uname;
    private int age;
    private String gender;
    private String location;
    private BigDecimal balance;
    private String describe;
    private String other;

    public User(int id, String uname, int age, String gender, String location, BigDecimal balance, String describe, String other) {
        this.id = id;
        this.uname = uname;
        this.age = age;
        this.gender = gender;
        this.location = location;
        this.balance = balance;
        this.describe = describe;
        this.other = other;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", location='" + location + '\'' +
                ", balance=" + balance +
                ", describe='" + describe + '\'' +
                ", other='" + other + '\'' +
                '}';
    }
}
