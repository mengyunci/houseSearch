package com.unknow.mapper;

import com.unknow.entity.MySecurity;
import com.unknow.entity.MySecurityExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MySecurityMapper {
    int countByExample(MySecurityExample example);

    int deleteByExample(MySecurityExample example);

    int deleteByPrimaryKey(String employeeSerial);

    int insert(MySecurity record);

    int insertSelective(MySecurity record);

    List<MySecurity> selectByExample(MySecurityExample example);

    int updateByExampleSelective(@Param("record") MySecurity record, @Param("example") MySecurityExample example);

    int updateByExample(@Param("record") MySecurity record, @Param("example") MySecurityExample example);
}