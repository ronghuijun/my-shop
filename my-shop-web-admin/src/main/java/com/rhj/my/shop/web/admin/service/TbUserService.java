package com.rhj.my.shop.web.admin.service;

import com.rhj.my.shop.domain.TbUser;

import java.util.List;

public interface TbUserService {
    public List<TbUser> selectAll();

    void insert(TbUser tbUser);

    void delete(Long id);

    TbUser getById(Long id);

    void update(TbUser tbUser);

    List<TbUser> selectByUsername(String username);
     //用户登录
    TbUser login(String email,String password);
}
