package com.example.mini.repo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.util.CollectionUtils;


/**
 * <p> Title : 分页对象 <p>
 * @author 	 : lw
 * @date     : 2018年5月2日 下午6:09:11
 */
public class Page<T extends BaseBean> {

	private static final String PAGE_SPACE = " ";
	private static final String PAGE_AND = " AND ";
	
	/** 当前页*/
	private Integer cpage;
	
	/** 本页查询最大数量*/
	private Integer size = 5;
	
	/** 共几页*/
	private Integer tpage = 0;
	
	private List<T> result;
	
	/** count and find sql after by tableName*/
	private StringBuilder sql;
	
	private List<String> where;
	
	public void setWhere(String sql) {
		if(CollectionUtils.isEmpty(where)){
			where = new ArrayList<String>();
		}
		where.add(sql);
	}

	public String saySql(){
		if(where == null){
			return PAGE_SPACE;
		}
		sql = new StringBuilder(BaseProvider.WHERE);
		Iterator<String> iterator = where.iterator();
		String next;
		boolean f = true;
		while (iterator.hasNext()) {
			next = iterator.next();
			sql.append(f ? PAGE_SPACE : PAGE_AND).append(next).append(PAGE_SPACE);
			f = false;
		}
		return sql.toString();
	}
	public Page(Integer cpage){
		this.cpage = cpage;
	}
	
	public Integer sayLimit(){
		return (cpage - 1) * size;
	}
	
	public void sayTpage(long count) {
		tpage = (int) Math.ceil((double)count/size);
	}
	
	public Integer getCpage() {
		return cpage;
	}

	public void setCpage(Integer cpage) {
		this.cpage = cpage;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getTpage() {
		return tpage;
	}

	public void setTpage(Integer tpage) {
		this.tpage = tpage;
	}

	public List<T> getResult() {
		return result;
	}

	public void setResult(List<T> result) {
		this.result = result;
	}


	private String[] auths;

	public String[] getAuths() {
		return auths;
	}

	public void setAuths(String[] auths) {
		this.auths = auths;
	}


	
}
