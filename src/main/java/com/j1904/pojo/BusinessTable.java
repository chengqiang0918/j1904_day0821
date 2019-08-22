package com.j1904.pojo;

import lombok.Data;

import java.io.Serializable;
@Data
public class BusinessTable implements Serializable {
    private int businessId;//商家id
    private String businessName;//商家名称
    private String businessPwd;//商家密码
    private String businessAddress;//商家地址
    private String businessPhone;//商家电话
    private String businessState;//商家状态（0表示商家已注销，1表示正常营业，2表示商家已休息）
    private String businessInfo;//商家信息（简介）
    private String businessImg;//商家图片
}
