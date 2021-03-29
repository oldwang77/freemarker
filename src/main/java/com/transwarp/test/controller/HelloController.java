package com.transwarp.test.controller;

import com.transwarp.test.config.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {

    @Autowired
    private Resource resource;

    @RequestMapping("/hello")
    public String hello(Model model) {
        // 注入配置文件到resource
        model.addAttribute("resource", resource);
        model.addAttribute("name", "wong");
        return "freemarker/hello";
    }

    @GetMapping("/user")
    public String center(ModelMap map) {
        map.put("users", parseUsers());
        map.put("title", "用户列表");
        return "freemarker/center/center";
    }

    private List<Map> parseUsers() {
        List<Map> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Map map = new HashMap();
            map.put("name", "kevin_" + i);
            map.put("age", 10 + i);
            map.put("phone", "1860291105" + i);
            list.add(map);
        }
        return list;
    }

}
