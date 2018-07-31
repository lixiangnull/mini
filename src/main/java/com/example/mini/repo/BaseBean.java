package com.example.mini.repo;

import java.io.Serializable;

public abstract class BaseBean implements Serializable{
	
	/** BaseBean.java :    @author lw */
	private static final long serialVersionUID = -7579856759648822609L;
	
	private Integer id;

	private String name;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		if(id != null){
			this.id = id;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
