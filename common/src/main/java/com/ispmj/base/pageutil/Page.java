package com.ispmj.base.pageutil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Page<E> implements java.io.Serializable{
	private int oldNowPage = 0;//老的页面
	
	private int pageShow = 5; //分页条数
	private int totalPage;//总计页面
	private int totalCount;	//总计条数
	private int start;//分页开始值
	private int nowPage;//当前页面
	private List<E> result = Collections.emptyList();//分页集合
	
	public int getOldNowPage(){
		return this.oldNowPage;
	}
	
	public int getStart() {
		start = (getNowPage()-1)*getPageShow();
		if(start<0){
			start = 0;
		}
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getPageShow() {
		return pageShow;
	}
	public void setPageShow(int pageShow) {
		this.pageShow = pageShow;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public List<E> getResult() {
		return result;
	}
	public void setResult(List<E> result) {
		this.result = result;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public void setNowPage(int nowPage) {
		this.oldNowPage = nowPage;
		this.nowPage = nowPage;
	}
	public int getTotalPage() {
		return  (int)Math.ceil(totalCount*1.0/pageShow);
	}
	public int getNowPage() {
		if(nowPage<=0)
			nowPage = 1;
		if(nowPage>getTotalPage())
			nowPage = getTotalPage();
		return nowPage;
	}
	@Override
	public String toString() {
		return "Page [pageShow=" + pageShow + ", totalPage=" + getTotalPage()
				+ ", totalCount=" + totalCount + ", nowPage=" + nowPage
				+ ", result=" + result + "]";
	}
	
	
}