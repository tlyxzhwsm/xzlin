package com.xzlin.userMag.controller;

import com.xzlin.userMag.entity.User;
import com.xzlin.userMag.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService us;
    @ResponseBody
    @RequestMapping(value ="/t")
    private String test(Model model) {

        String name = us.getUsers().get(0).getUname();
        System.out.println("测试" + name);

        return  model.addAttribute(name).toString();
    }

    @ResponseBody
    @RequestMapping(value ="/s2",produces="application/json; charset=utf-8")
    private User test2(Model model) {

        return  us.getUsers().get(0);
    }
}
