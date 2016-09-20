package com.firebugsoft.template.dubbo.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.firebugsoft.template.dubbo.api.IUserService;
import com.firebugsoft.template.dubbo.api.vo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-*.xml")
public class UserServiceTest {
    @Resource
    private IUserService userService;

    @Test
    public void findById() {
    	User user = userService.findById(1L);
    	System.out.println(user);
    }
}
