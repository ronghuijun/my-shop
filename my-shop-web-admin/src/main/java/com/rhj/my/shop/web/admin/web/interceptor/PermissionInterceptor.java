package com.rhj.my.shop.web.admin.web.interceptor;

import com.rhj.my.shop.commons.constant.ConstantUtils;
import com.rhj.my.shop.domain.TbUser;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.handler.Handler;

/**
 * @Auther: Geolia
 * @Date: 2020/4/24 12:14
 * @Description:
 */
//权限拦截器
public class PermissionInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        return true;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        //以login结尾请求
        if(modelAndView.getViewName().endsWith("login")){
            TbUser user =(TbUser) httpServletRequest.getSession().getAttribute(ConstantUtils.SESSION_USER);
            if(user!=null){
                httpServletResponse.sendRedirect("/main");
            }
        }
    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
