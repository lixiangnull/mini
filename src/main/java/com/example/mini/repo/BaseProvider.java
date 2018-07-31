package com.example.mini.repo;

public abstract class BaseProvider{

	protected static final String SELECT = "SELECT ";
	protected static final String LIMIT = " limit ";
	protected static final String FROM = " FROM ";
	public static final String WHERE = " WHERE ";
	protected static final String UPDATE_KEY = " WHERE id=";
	
	protected static final String _COMMA =",";
	protected static final String _SPACE =" ";
	protected static final String _SPACE_COMMA =" ,";
	protected static final String _EQ ="=";
	protected static final String _EQ_STR ="='";
	protected static final String _STR ="'";
	protected static final String _IN_STAR = "in (";
	protected static final String _IN_END = ");";
	
	protected static final String NAME_ = "name=#{name}";
	protected static final String ID_ = "id=#{id}";
	protected static final String DES_ = "des=#{des}";
	
}
