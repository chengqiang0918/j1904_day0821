package com.j1904.mapper;

import com.j1904.pojo.UserTable;
import com.j1904.pojo.UserTableExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserTableMapper {
    public List<UserTable> findAll();

}