package com.example.mini.controller;

import com.example.mini.DTOConvert.impl.UserInputDTOConvert;
import com.example.mini.entity.DTO.UserInputDTO;
import com.example.mini.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述：{...}
 * Created by LX.
 * Date: 2018/7/16/0016 11:25
 */
@Controller
@RequestMapping(value = "/index")
public class UserController {

    @Autowired
    private UserInputDTOConvert userInputDTOConvert;

    public User adduser(UserInputDTO userInputDTO){

        User user = userInputDTOConvert.convret(userInputDTO);

        return null;
    }



}
