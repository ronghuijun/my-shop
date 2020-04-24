package com.rhj.my.shop.web.admin.dao;

import com.rhj.my.shop.domain.User;

public interface UserDao {
    public User getUser(String email, String password);
    //根据邮箱密码获取用户信息
}
