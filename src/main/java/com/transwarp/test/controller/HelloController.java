package com.transwarp.test.controller;

import com.transwarp.test.config.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @Autowired
    private Resource resource;

    @RequestMapping("/hello")
    public String hello(Model model) {

        // 注入配置文件到resource
        model.addAttribute("resource",resource);

        model.addAttribute("name", "wong");
        return "freemarker/hello";
    }

}
