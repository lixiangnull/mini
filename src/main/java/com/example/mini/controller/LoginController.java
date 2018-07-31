package com.example.mini.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "")
public class LoginController {

    private final Logger log = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "/login")
    @ResponseBody
    public String volidate(String username, String password) {
        System.out.println("comein");
        System.out.println(username);
        System.out.println(password);

        if ("admin".equals(username) && "1".equals(password)) {
            log.info(username+"登录成功！");
            return "success";
        } else {
            log.info(username+"登录失败！密码为："+password);
            return "fail";
        }
    }
    @RequestMapping(value="index")
    public String index(){
        return "index";
    }

}
