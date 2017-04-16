package com.unknow.controller;

import com.unknow.entity.Employee;
import com.unknow.entity.EmployeeExample;
import com.unknow.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by hotman on 2017/4/16.
 */
@Controller
public class EmployeeController {


    @Autowired
    private EmployeeMapper employeeMapper;

    @ResponseBody
    @RequestMapping("/employee/combo")
    public List<Employee> findAll(@RequestParam("q") String userId){
        EmployeeExample employeeExample = new EmployeeExample();
        employeeExample.createCriteria().andEmployeeNameLike("%" + userId + "%");

        return employeeMapper.selectByExample(employeeExample);

    }
}
