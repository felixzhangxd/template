package com.firebugsoft.template.api.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.alibaba.fastjson.JSONObject;

@ApiModel
public class User {
    @Min(value = 1)
    @ApiModelProperty(value = "用户id", required = false)
    private Integer id;
    @NotNull
    @Length(min = 8, max = 16)
    @ApiModelProperty(value = "用户名", required = true)
    private String  name;
    
    public User() {}

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
