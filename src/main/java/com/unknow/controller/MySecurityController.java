package com.unknow.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.unknow.entity.Employee;
import com.unknow.entity.EmployeeExample;
import com.unknow.entity.MySecurity;
import com.unknow.entity.MySecurityExample;
import com.unknow.mapper.EmployeeMapper;
import com.unknow.mapper.MySecurityMapper;
import com.unknow.utils.Result;
import org.apache.commons.lang3.StringUtils;
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
    public PageInfo<Employee> showAll(String username, @RequestParam(value = "page", defaultValue = "1") int pageNum, @RequestParam(value = "rows", defaultValue = "20") int pageSize
                          ) {
        if (StringUtils.isBlank(username)) {
            username = "";
        }

        PageHelper.startPage(pageNum,pageSize);
        return new PageInfo<>(employeeMapper.findBySecurity(username));
    }

    @RequestMapping("/security/add")
    @ResponseBody
    public Result add(Employee employee) {
        if (StringUtils.isBlank(employee.getEmployeeSerial())) {
            return new Result(false,"请选择需要添加的人员");
        }

        EmployeeExample example = new EmployeeExample();
        example.createCriteria().andEmployeeSerialEqualTo(employee.getEmployeeSerial());

        int count = employeeMapper.countByExample(example);


        if (count == 0) {
            return new Result(false,"没有查到该用户");
        }

        MySecurityExample mySecurityExample = new MySecurityExample();
        mySecurityExample.createCriteria().andEmployeeSerialEqualTo(employee.getEmployeeSerial());

        count = securityMapper.countByExample(mySecurityExample);
        if (count > 0) {
            return new Result(false,"该用户已经存在");
        }


        MySecurity mySecurity = new MySecurity();
        mySecurity.setEmployeeSerial(employee.getEmployeeSerial());
        securityMapper.insert(mySecurity);

        return new Result(true,"加入成功");
    }

    @RequestMapping("/security/remove")
    @ResponseBody
    public Result remove(String id) {
        if (StringUtils.isBlank(id)) {
            return new Result(false,"请选择需要移除的人员");
        }

        MySecurityExample mySecurityExample = new MySecurityExample();
        mySecurityExample.createCriteria().andEmployeeSerialEqualTo(id);

        int count = securityMapper.countByExample(mySecurityExample);
        if (count == 0) {
            return new Result(false,"该用户不存在");
        }

        securityMapper.deleteByPrimaryKey(id);

        return new Result(true,"移除成功");
    }


}
