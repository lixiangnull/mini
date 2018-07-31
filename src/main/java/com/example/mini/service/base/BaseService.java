package com.example.mini.service.base;

import com.example.mini.repo.BaseBean;
import com.example.mini.repo.IMapper;
import com.example.mini.repo.Page;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

/**
 * 类描述：{...}
 * Created by LX.
 * Date: 2018/7/23/0023 14:07
 */

public abstract class BaseService <T extends BaseBean, E extends IMapper<T>>{


    @Autowired
    private IMapper<T> mapper;

    @SuppressWarnings("unchecked")
    protected E getRepo(){
        return (E) mapper;
    }

    public void page(Page<T> page) {
        String saySql = page.saySql();
        long count = mapper.countBySQL(saySql);
        if(count < page.sayLimit()){
            page.setResult(new ArrayList<T>());
        }
        page.sayTpage(count);
        if(count > 0){
            page.setResult(mapper.findLimitAndSize(saySql, page.sayLimit(), page.getSize()));
        }
    }

    public T findOne(Integer id) {
        return mapper.findOne(id);
    }

    public void saveOrUpdate(T bean) {
        if(bean.getId() == null){
            mapper.insert(bean);
        }else{
            mapper.update(bean);
        }
    }

    public void delete(Integer... ids) {
        if(true){
            if(ids.length == 1){
                mapper.delete(new StringBuffer(" =").append(ids[0]).toString());
            }else{
                StringBuilder sb = new StringBuilder(" in ( ");
                for(int i = 0; i < ids.length; i++){
                    sb.append(ids[i]).append(",");
                }
                sb.delete(sb.length()-1, sb.length()).append(")");
                mapper.delete(sb.toString());
            }
        }
    }

}
