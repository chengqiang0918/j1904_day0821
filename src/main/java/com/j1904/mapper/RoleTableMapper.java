package com.j1904.mapper;

import com.j1904.pojo.RoleTable;
import com.j1904.pojo.RoleTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleTableMapper {
    int countByExample(RoleTableExample example);

    int deleteByExample(RoleTableExample example);

    int insert(RoleTable record);

    int insertSelective(RoleTable record);

    List<RoleTable> selectByExample(RoleTableExample example);

    int updateByExampleSelective(@Param("record") RoleTable record, @Param("example") RoleTableExample example);

    int updateByExample(@Param("record") RoleTable record, @Param("example") RoleTableExample example);
}