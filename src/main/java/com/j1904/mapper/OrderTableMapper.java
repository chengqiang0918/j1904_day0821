package com.j1904.mapper;

import com.j1904.pojo.OrderTable;
import com.j1904.pojo.OrderTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderTableMapper {
    int countByExample(OrderTableExample example);

    int deleteByExample(OrderTableExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(OrderTable record);

    int insertSelective(OrderTable record);

    List<OrderTable> selectByExample(OrderTableExample example);

    OrderTable selectByPrimaryKey(Integer oid);

    int updateByExampleSelective(@Param("record") OrderTable record, @Param("example") OrderTableExample example);

    int updateByExample(@Param("record") OrderTable record, @Param("example") OrderTableExample example);

    int updateByPrimaryKeySelective(OrderTable record);

    int updateByPrimaryKey(OrderTable record);
}