package com.example.mini.entity;

import com.example.mini.repo.BaseBean;

public class User extends BaseBean {
    private String uid;
    private String password;

    public User(String uid, String password) {
        this.uid = uid;
        this.password = password;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
