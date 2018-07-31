package com.example.mini.controller;

import com.example.mini.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController
@Controller
@RequestMapping(value = "/0")
public class TestController {

    @RequestMapping("/1")
    @ResponseBody
    public User test(){
        User user = new User();
        user.setUid("小米111");
        user.setPassword("123456");
        return user;
    }

    @RequestMapping("/2")
    public String test2(){
        return "error";
    }
}
