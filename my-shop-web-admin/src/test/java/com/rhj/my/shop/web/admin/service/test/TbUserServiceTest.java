package com.rhj.my.shop.web.admin.service.test;

import com.rhj.my.shop.domain.TbUser;
import com.rhj.my.shop.web.admin.service.TbUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.List;

/**
 * @Auther: Geolia
 * @Date: 2020/4/25 14:39
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml","classpath:spring-context-druid.xml","classpath:spring-context-mybatis.xml"})
public class TbUserServiceTest {
    @Autowired
    private TbUserService tbUserService;

    @Test
    public void testSelectAll(){
        List<TbUser> tbUsers=tbUserService.selectAll();
        for (TbUser tbUser:tbUsers){
            System.out.println(tbUser.getUsername());
        }
    }
    @Test
    public void testInsert(){
        TbUser tbUser=new TbUser();
        tbUser.setUsername("Zoe");
        tbUser.setPhone("13151515111");
        tbUser.setEmail("admin@111");
        tbUser.setPassword(DigestUtils.md5DigestAsHex("admin".getBytes()));
        tbUser.setCreated(new Date());
        tbUser.setUpdated(new Date());
        tbUserService.insert(tbUser);

    }
    @Test
    public void testDelete(){
        tbUserService.delete(38L);

    }
    @Test
    public void testGetById(){
        TbUser tbUser = tbUserService.getById(35L);
        System.out.println(tbUser.getUsername());

    }
    @Test
    public void testUpdate(){
        TbUser tbUser=tbUserService.getById(36L);
        tbUser.setUsername("Geolia");
        tbUserService.update(tbUser);
    }
    @Test
    public void testSelectByName(){
        List<TbUser> tbUsers=tbUserService.selectByUsername("uni");
        for (TbUser tbUser : tbUsers) {
            System.out.println(tbUser);
        }
    }


}
