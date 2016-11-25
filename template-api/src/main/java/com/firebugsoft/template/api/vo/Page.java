package com.firebugsoft.template.api.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@ApiModel
public class Page {
    @Min(value = 1)
    @ApiModelProperty(value = "page number", required=true)
    private Integer pn = 1;
    @Max(value = 20)
    @ApiModelProperty(value = "page size", required=true)
    private Integer ps;

    public Integer getPn() {
        return pn;
    }

    public void setPn(Integer pn) {
        this.pn = pn;
    }

    public Integer getPs() {
        return ps;
    }

    public void setPs(Integer ps) {
        this.ps = ps;
    }
}
