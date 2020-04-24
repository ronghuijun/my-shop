package com.rhj.my.shop.web.admin.service.impl;

import com.rhj.my.shop.domain.User;
import com.rhj.my.shop.web.admin.dao.UserDao;
import com.rhj.my.shop.web.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: Geolia
 * @Date: 2020/4/24 17:53
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public User login(String email, String password) {

        return userDao.getUser(email, password);
    }
}
