package com.rhj.my.shop.web.admin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: Geolia
 * @Date: 2020/4/24 17:55
 * @Description:
 */
@Controller
public class MainController {
    @RequestMapping(value = "main",method = RequestMethod.GET)
    public String main(){
        return "main";

    }

}
