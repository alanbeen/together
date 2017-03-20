package com.huaxia.test.utils.page;

import java.io.Serializable;

public class Page implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private int pageSize = 10; 
	private int currentPage = 1; 
	private int begin;
	private int end;
	private String startTime;
	private String endTime;

	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		setEnd(pageSize);
		this.pageSize = pageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		setBegin((currentPage - 1) * pageSize);
		this.currentPage = currentPage;
	}
	
	public int getBegin() {
		begin = (currentPage - 1) * pageSize;
		return begin;
	}
	public void setBegin(int begin) {
		this.begin = begin;
	}
	
	public int getEnd() {
		return  pageSize;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	
}
