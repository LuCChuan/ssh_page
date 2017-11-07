package com.prj.action;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Controller;

import com.prj.bean.Emp;
import com.prj.bean.Page;
import com.prj.biz.IEmpBiz;

@Controller
@ParentPackage("struts-default")
@Namespace("/show")
public class IndexAction {
	@Resource
	private IEmpBiz empBiz;
	private Page<Emp> empPage;
	
	@Action(value="/show",results={@Result(name="succ",location="/show.jsp")})
	public String show(){
		empPage = empBiz.showAllEmpByPage(empPage);
		return "succ";
	}
	
	
	
	
	
	
	
	
	
	public IEmpBiz getEmpBiz() {
		return empBiz;
	}

	public void setEmpBiz(IEmpBiz empBiz) {
		this.empBiz = empBiz;
	}









	public Page<Emp> getEmpPage() {
		return empPage;
	}









	public void setEmpPage(Page<Emp> empPage) {
		this.empPage = empPage;
	}
	
	
	
	
}
