package com.prj.bean;

import java.util.List;

public class Page<T> {
	
	private int currentPage = 1;//当前页数
	private int maxResult = 5;//每页显示的行数
	private int count; //所有数据的行数
	private int allPage; //总共页数
	private List<T> pageList;
	
	
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getMaxResult() {
		return maxResult;
	}
	public void setMaxResult(int maxResult) {
		this.maxResult = maxResult;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getAllPage() {
		return count%maxResult==0?count/maxResult:count/maxResult+1;
	}
	public void setAllPage(int allPage) {
		this.allPage = allPage;
	}
	public List<T> getPageList() {
		return pageList;
	}
	public void setPageList(List<T> pageList) {
		this.pageList = pageList;
	}
	
	
	
	
	
}
