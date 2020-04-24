package com.rhj.my.shop.web.admin.service;

import com.rhj.my.shop.domain.User;

public interface UserService {
    //登录邮箱密码
    public User login(String email, String password);

}
