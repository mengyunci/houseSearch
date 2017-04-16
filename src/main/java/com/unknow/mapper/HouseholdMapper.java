package com.unknow.mapper;

import com.unknow.entity.Household;
import com.unknow.entity.HouseholdExample;
import com.unknow.entity.HouseholdKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HouseholdMapper {
    int countByExample(HouseholdExample example);

    int deleteByExample(HouseholdExample example);

    int deleteByPrimaryKey(HouseholdKey key);

    int insert(Household record);

    int insertSelective(Household record);

    List<Household> selectByExample(HouseholdExample example);

    Household selectByPrimaryKey(HouseholdKey key);

    int updateByExampleSelective(@Param("record") Household record, @Param("example") HouseholdExample example);

    int updateByExample(@Param("record") Household record, @Param("example") HouseholdExample example);

    int updateByPrimaryKeySelective(Household record);

    int updateByPrimaryKey(Household record);
}