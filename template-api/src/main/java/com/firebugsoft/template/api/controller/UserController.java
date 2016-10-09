package com.firebugsoft.template.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.firebugsoft.common.mvc.json.Body;

@Controller
@RequestMapping(value={"/user"})
public class UserController {
    @RequestMapping(value={"/find"})
    public @ResponseBody Body findById(Integer id) {
        return Body.newInstance(id);
    }
}
