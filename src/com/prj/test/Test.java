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
		
		System.out.println("��ҳ��"+empPage.getAllPage());
		System.out.println("������"+empPage.getCount());
		System.out.println("��ǰҳ"+empPage.getCurrentPage());
		System.out.println("ÿҳ���"+empPage.getMaxResult());
		System.out.println("Ա������"+empPage.getPageList().size());
	}
}
