package com.rhj.my.shop.web.admin.dao;

import com.rhj.my.shop.domain.TbUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbUserDao {
    //查询用户表所有信息
    public List<TbUser> selectAll();

    //添加
    void insert(TbUser tbUser);

    //删除
    void delete(Long id);

    //根据id查询用户信息
    TbUser getById(Long id);
    //更新
    void update(TbUser tbUser);

    //根据用户名模糊匹配
    public List<TbUser> selectByUsername(String username);
    //根据邮箱查询用户信息
    TbUser getByEmail(String email);
}
