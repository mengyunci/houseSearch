package com.unknow.mapper;

import com.unknow.entity.House;
import com.unknow.entity.HouseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HouseMapper {
    int countByExample(HouseExample example);

    int deleteByExample(HouseExample example);

    int deleteByPrimaryKey(String areaSerial);

    int insert(House record);

    int insertSelective(House record);

    List<House> selectByExampleWithBLOBs(HouseExample example);

    List<House> selectByExample(HouseExample example);

    House selectByPrimaryKey(String areaSerial);

    int updateByExampleSelective(@Param("record") House record, @Param("example") HouseExample example);

    int updateByExampleWithBLOBs(@Param("record") House record, @Param("example") HouseExample example);

    int updateByExample(@Param("record") House record, @Param("example") HouseExample example);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKeyWithBLOBs(House record);

    int updateByPrimaryKey(House record);
}