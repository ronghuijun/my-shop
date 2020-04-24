package com.rhj.my.shop.domain;

import java.io.Serializable;

/**
 * @Auther: Geolia
 * @Date: 2020/4/24 17:42
 * @Description:
 */
public class User implements Serializable {
    private String email;
    private String password;
    private String username;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
