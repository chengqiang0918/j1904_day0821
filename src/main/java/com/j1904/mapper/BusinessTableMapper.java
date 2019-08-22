package com.j1904.mapper;

import com.j1904.pojo.BusinessTable;
import com.j1904.pojo.BusinessTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessTableMapper {
    int countByExample(BusinessTableExample example);

    int deleteByExample(BusinessTableExample example);

    int deleteByPrimaryKey(Integer businessid);

    int insert(BusinessTable record);

    int insertSelective(BusinessTable record);

    List<BusinessTable> selectByExample(BusinessTableExample example);

    BusinessTable selectByPrimaryKey(Integer businessid);

    int updateByExampleSelective(@Param("record") BusinessTable record, @Param("example") BusinessTableExample example);

    int updateByExample(@Param("record") BusinessTable record, @Param("example") BusinessTableExample example);

    int updateByPrimaryKeySelective(BusinessTable record);

    int updateByPrimaryKey(BusinessTable record);
}