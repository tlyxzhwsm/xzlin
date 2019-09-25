package com.xzlin.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/")
public class IndexController {
    @RequestMapping("/")
    public String index() {
        System.out.println("首页");

        return "index";
    }
}
