package com.j1904.mapper;

import com.j1904.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface GoodsMapper {
    public List<Goods> findAll();
}
