package com.prj.dao;

import java.util.List;

import com.prj.bean.Page;

public interface ICommonDao<T> {
	
	public List<T> queryAllByPage(Page<T> page,String hql);
	public T query(Class<T> clas, int id);
	public boolean add(T t);
	public boolean del(T t);
	public boolean upd(T t);
	
}
