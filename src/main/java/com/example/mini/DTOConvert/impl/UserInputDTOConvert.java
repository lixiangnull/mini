package com.example.mini.DTOConvert.impl;

import com.example.mini.DTOConvert.DTOConvert;
import com.example.mini.entity.DTO.UserInputDTO;
import com.example.mini.entity.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * 类描述：{...}
 * Created by LX.
 * Date: 2018/7/16/0016 10:38
 */
@Service
public class UserInputDTOConvert implements DTOConvert<UserInputDTO,User>{

   //快速实现接口快捷键 alt+shirt+p
    @Override
    public User convret(UserInputDTO userInputDTO) {
        return null;
    }
}
