package com.unknow.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.unknow.entity.Employee;
import com.unknow.mapper.EmployeeMapper;
import com.unknow.mapper.MySecurityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by hotman on 2017/4/16.
 */
@Controller
public class MySecurityController {

    @Autowired
    private MySecurityMapper securityMapper;

    @Autowired
    private EmployeeMapper employeeMapper;

    @RequestMapping("/security")
    public String showPage() {
        return "security";
    }

    @RequestMapping("/security/showall")
    @ResponseBody
    public PageInfo<Employee> showAll(HttpSession session, @RequestParam(value = "page", defaultValue = "1") int pageNum, @RequestParam(value = "rows", defaultValue = "20") int pageSize
                          ) {

        Employee employee = (Employee) session.getAttribute("user");

        PageHelper.startPage(pageNum,pageSize);

        return new PageInfo<>(employeeMapper.findBySecurity(employee.getEmployeeSerial()));
    }


}
