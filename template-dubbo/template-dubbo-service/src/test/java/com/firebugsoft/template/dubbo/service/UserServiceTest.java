package com.firebugsoft.template.dubbo.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.firebugsoft.template.dubbo.api.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-*.xml")
public class UserServiceTest {
    @Resource
    private IUserService userService;

    @Test
    public void findById() throws InterruptedException {
    	System.out.println("start: " + System.currentTimeMillis());
    	System.out.println(userService.findById(1000L));
    	System.out.println("end: " + System.currentTimeMillis());
    	Thread.sleep(10000000L);
    }
}
