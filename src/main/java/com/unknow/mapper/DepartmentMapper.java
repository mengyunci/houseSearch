package com.unknow.mapper;

import com.unknow.entity.Department;
import com.unknow.entity.DepartmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentMapper {
    int countByExample(DepartmentExample example);

    int deleteByExample(DepartmentExample example);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByExample(DepartmentExample example);

    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);
}