package com.firebugsoft.template.web.staff.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.firebugsoft.template.web.staff.vo.SignIn;

@Controller
@RequestMapping(value={"/staff"})
public class StaffController {
    @RequestMapping(value={"/register"})
    public String register(SignIn staff) {
        return "/staff/register";
    }
    
    @RequestMapping(value={"/sign-in"})
    public String signIn(SignIn staff) {
        return "/staff/sign-in";
    }
    
    @RequestMapping(value={"/sign-out"})
    public String signOut(SignIn staff) {
        return "/staff/sign-out";
    }
}
