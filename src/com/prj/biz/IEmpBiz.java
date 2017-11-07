package com.prj.biz;

import java.util.List;

import com.prj.bean.Emp;
import com.prj.bean.Page;


public interface IEmpBiz {
	
	public Page<Emp> showAllEmpByPage(Page<Emp> empPage);
	
	
}
