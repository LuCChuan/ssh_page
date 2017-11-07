package com.prj.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.prj.bean.Emp;
import com.prj.bean.Page;
import com.prj.biz.IEmpBiz;
import com.prj.dao.ICommonDao;

@Service
public class EmpBiz implements IEmpBiz {
	@Resource
	private ICommonDao<Emp>  commonDao;
	
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public Page<Emp> showAllEmpByPage(Page<Emp> empPage) {
		
		List<Emp> empList = commonDao.queryAllByPage(empPage, "from Emp");		
		//将查到的集合存入到page中
		empPage.setPageList(empList);
		//查询所有员工
		List<Emp> allEmp = commonDao.queryAllByPage(null, "from Emp");
		empPage.setCount(allEmp.size());
		
		return empPage;
	}

	
	
	
	
	public ICommonDao<Emp> getCommonDao() {
		return commonDao;
	}

	public void setCommonDao(ICommonDao<Emp> commonDao) {
		this.commonDao = commonDao;
	}

}
