package com.j1904.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class OrderTable implements Serializable {
    private int oid;//订单号
    private String oname;//订单名称（xx的订单）
    private Date ocreatTime;//创建时间
    private String ocustomerName;//顾客名字
    private String ocustomerPhone;//顾客电话
    private String ocustomerAddress;//顾客地址
    private String ogoodsName;//商品名称
    private double ogoodsUnitprice;//商品单价
    private String oremarks;//备注
    private int ostate;//订单状态（1表示客户已下单，2表示订单已完成，0表示订单未完成）
}
