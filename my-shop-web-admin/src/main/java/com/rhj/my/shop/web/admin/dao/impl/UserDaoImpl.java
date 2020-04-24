package com.rhj.my.shop.web.admin.dao.impl;

import com.rhj.my.shop.domain.User;
import com.rhj.my.shop.web.admin.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * @Auther: Geolia
 * @Date: 2020/4/24 17:45
 * @Description:
 */

@Repository
public class UserDaoImpl implements UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    public User getUser(String email, String password) {
        logger.debug("调用getUser(),email为:{}, password:{} ",email,password);


        User user=null;
        if("admin@qq.com".equals(email)){
            if("admin".equals(password)){
                user = new User();
                user.setEmail("damin@qq.com");
                user.setUsername("Zoe");
                logger.info("成功获取\"{}\"的用户信息",user.getUsername());

            }
        }else {
            logger.warn("获取\"{}\"的用户信息失败",email);
        }
        return user;
    }
}
