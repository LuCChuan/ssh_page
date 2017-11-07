package com.prj.dao.impl;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.prj.bean.Page;
import com.prj.dao.ICommonDao;

@Repository
public class CommonDao<T> implements ICommonDao<T> {
	@Resource
	private HibernateTemplate hibernateTemplate;
	
	public List<T> queryAllByPage(final Page<T> page,final String hql) {
		return hibernateTemplate.executeFind(new HibernateCallback<List<T>>() {

			public List<T> doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery(hql);
				if(page!=null){
					query.setFirstResult((page.getCurrentPage()-1)*page.getMaxResult());
					query.setMaxResults(page.getMaxResult());
				}
				return query.list();
			}
		});
	}
	
	
	public T query(Class<T> clas, int id) {
		return hibernateTemplate.get(clas, id);
	}

	public boolean add(T t) {
		try {
			hibernateTemplate.save(t);
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean del(T t) {
		try {
			hibernateTemplate.delete(t);
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean upd(T t) {
		try {
			hibernateTemplate.update(t);
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


















	
	
	
	
	
	
	
	
}
