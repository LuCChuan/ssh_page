package com.prj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prj.bean.Emp;
import com.prj.bean.Page;
import com.prj.biz.IEmpBiz;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IEmpBiz empBiz =(IEmpBiz)context.getBean("empBiz");
		Page<Emp> empPage = empBiz.showAllEmpByPage(new Page<Emp>());
		
		System.out.println("总页数"+empPage.getAllPage());
		System.out.println("总行数"+empPage.getCount());
		System.out.println("当前页"+empPage.getCurrentPage());
		System.out.println("每页跨度"+empPage.getMaxResult());
		System.out.println("员工数量"+empPage.getPageList().size());
	}
}
