package com.unknow.controller;

import com.unknow.dto.BaseMenu;
import com.unknow.entity.*;
import com.unknow.mapper.MenuMapper;
import com.unknow.mapper.MySecurityMapper;
import com.unknow.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by hotman on 2017/4/16.
 */
@Controller
public class MenuController {


    @Autowired
    private MenuMapper menuMapper;

    @Autowired
    private MySecurityMapper mySecurityMapper;

    @RequestMapping("mainmenu")
    @ResponseBody
    public List<BaseMenu> showMainMenu(HttpSession session) {
        Employee employee = (Employee) session.getAttribute("user");

        MySecurityExample example = new MySecurityExample();
//        example.createCriteria().andEmployeeSerialEqualTo(employee.getEmployeeSerial());
        example.createCriteria().andEmployeeSerialEqualTo("00000003");


        int count = mySecurityMapper.countByExample(example);

        List<BaseMenu> baseMenus = new ArrayList<>();

        BaseMenu baseMenu = new BaseMenu();
        baseMenu.setId("0");
        baseMenu.setText("信息查询");

        MenuExample menuExample = new MenuExample();
        if (count == 0) {
            menuExample.createCriteria().andMenuIdEqualTo(2);
        }
        List<Menu> menus = menuMapper.selectByExample(menuExample);
        List<BaseMenu> list = menus.stream().map(e -> {
            BaseMenu menu = new BaseMenu();
            menu.setId(e.getMenuId().toString());
            menu.setText(e.getMenuName());
            menu.setUrl(e.getUrl());
            menu.setState("open");
            menu.setUrl(menu.getUrl());
            return menu;
        }).collect(Collectors.toList());
        baseMenu.setChildren(list);
        baseMenus.add(baseMenu);
        return baseMenus;
    }
}
