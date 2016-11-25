package com.firebugsoft.template.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.validation.Valid;

import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;

import com.firebugsoft.common.mvc.json.Body;
import com.firebugsoft.template.api.vo.Page;
import com.firebugsoft.template.api.vo.User;


@Api(description = "用户")
@RestController
@RequestMapping(value = { "/user" })
public class UserController {
    @ApiOperation(value = "添加用户")
    @RequestMapping(value = { "/save" }, method = { RequestMethod.POST })
    public Body save(@Valid User user, @ApiIgnore Errors errors) {
        return Body.newInstance(user);
    }
    
    @ApiOperation(value = "删除用户")
    @RequestMapping(value = { "/remove/{id}" }, method = { RequestMethod.DELETE })
    public Body remove(@PathVariable Integer id) {
        return Body._200;
    }

    @ApiOperation(value = "修改用户")
    @RequestMapping(value = { "/modify" }, method = { RequestMethod.PUT })
    public Body modify(@Valid @RequestBody User user, @ApiIgnore Errors errors) {
        return Body.newInstance(user);
    }
    
    @ApiOperation(value = "查询用户")
    @RequestMapping(value = { "/query/{id}" }, method = { RequestMethod.GET })
    public Body query(@PathVariable Integer id) {
        return Body.newInstance(new User(id, "felix"));
    }
    
    @ApiOperation(value = "查询用户")
    @RequestMapping(value = { "/query/page" }, method = { RequestMethod.GET })
    public Body query(@Valid Page page, @ApiIgnore Errors errors) {
        return Body.newInstance(page);
    }
}
