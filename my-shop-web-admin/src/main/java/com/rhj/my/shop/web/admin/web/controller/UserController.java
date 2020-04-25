package com.rhj.my.shop.web.admin.web.controller;

import com.rhj.my.shop.domain.TbUser;
import com.rhj.my.shop.web.admin.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: Geolia
 * @Date: 2020/4/25 20:53
 * @Description:用户管理
 */
@Controller
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private TbUserService tbUserService;


    //跳转到用户列表页
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public String list(){
        return "user_list";


    }
}
