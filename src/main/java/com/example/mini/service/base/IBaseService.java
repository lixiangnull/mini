package com.example.mini.service.base;

import com.example.mini.repo.BaseBean;
import com.example.mini.repo.Page;

/**
 * 类描述：{...}
 * Created by LX.
 * Date: 2018/7/23/0023 13:54
 */

public interface IBaseService<T extends BaseBean> {

    void page(Page<T> page);

    T findOne(Integer id);

    void saveOrUpdate(T bean);

    void delete(Integer... id);

}
