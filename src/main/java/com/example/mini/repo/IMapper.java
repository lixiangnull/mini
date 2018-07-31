package com.example.mini.repo;

import java.util.List;


public interface IMapper<T extends BaseBean> {


	T findOne(Integer id);
	
	void insert(T bean);
	
	void update(T bean);
	
	void delete(String sql);
	
	List<T> findLimitAndSize(String sql, Integer limit, Integer size);
	
	long countBySQL(String sql);

	
	
}
