package com.j1904.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Goods implements Serializable {

    private int gid;//商品id
    private String gname;//商品名称
    private double gprice;//商品价格
    private String ginfo;//商品信息
    private String gimg;//商品图片
}
