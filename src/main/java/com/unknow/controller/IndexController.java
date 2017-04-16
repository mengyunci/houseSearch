package com.unknow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by mac on 16/3/17.
 */
@Controller
public class IndexController {

    @RequestMapping(value = {"/login","/"},method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)

    public String loginPost() {
        return "login";
    }

    public String index() {
        return "index";
    }


}
