package com.rhj.my.shop.web.admin.web.controller;

import com.rhj.my.shop.commons.constant.ConstantUtils;
import com.rhj.my.shop.domain.TbUser;
import com.rhj.my.shop.domain.User;
import com.rhj.my.shop.web.admin.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: Geolia
 * @Date: 2020/4/24 17:55
 * @Description:
 */
@Controller
public class LoginController{
    @Autowired
    private TbUserService tbUserService;

    //跳转登录页面
    @RequestMapping(value = {"","login"},method = RequestMethod.GET)
    public String login(){

        return "login";
    }

    //登录逻辑
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(@RequestParam(required = true) String email, @RequestParam(required = true) String password, HttpServletRequest httpServletRequest, Model model){

        TbUser tbUser=tbUserService.login(email,password);
        //登录失败
        if (tbUser==null){
            model.addAttribute("message","邮箱或者密码错误请重新输入");
            return login();
        }
        //登录成功
        else {
            //将登录信息放入会话
            httpServletRequest.getSession().setAttribute(ConstantUtils.SESSION_USER,tbUser);
            return "redirect:/main";

        }


    }
    //注销
    @RequestMapping(value = "logout",method = RequestMethod.GET)
    public String logout(HttpServletRequest httpServletRequest){
        httpServletRequest.getSession().invalidate();
        return login();

    }

}

