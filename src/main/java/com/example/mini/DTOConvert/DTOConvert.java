package com.example.mini.DTOConvert;

/**
 * 类描述：{定义对象转换接口
 *          学习
 *          }
 * Created by LX.
 * Date: 2018/7/16/0016 10:35
 */

public interface DTOConvert<S,T> {
    T convret(S s);
}
