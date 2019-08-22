package com.j1904.service.impl;

import com.j1904.mapper.GoodsMapper;
import com.j1904.pojo.Goods;
import com.j1904.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceimpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> findAll() {
        return goodsMapper.findAll();
    }
}
