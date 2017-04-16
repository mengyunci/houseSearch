package com.unknow.controller;

import com.unknow.dto.BaseMenu;
import com.unknow.entity.Area;
import com.unknow.entity.Employee;
import com.unknow.entity.EmployeeExample;
import com.unknow.mapper.EmployeeMapper;
import com.unknow.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by mac on 16/3/17.
 */
@Controller
public class IndexController {


    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private AreaService areaService;

    @RequestMapping(value = {"/login","/"},method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String loginPost() {




        return "login";
    }

    @RequestMapping(value = "/tree")
    @ResponseBody
    public List<BaseMenu> treeLoad(Model model) {
        return areaService.findTreeByEmplayeeId("");
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("username");
        session.removeAttribute("user");
        return "redirect:/login";
    }

}
