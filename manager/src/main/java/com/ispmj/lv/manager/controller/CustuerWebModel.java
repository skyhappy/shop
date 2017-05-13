package com.ispmj.lv.manager.controller;
/**用于网页之间传递数据用**/
public class CustuerWebModel {
	private String jsonStrQuery;
	private int showPage;
	private int nowPage;
	public String getJsonStrQuery() {
		return jsonStrQuery;
	}
	public void setJsonStrQuery(String jsonStrQuery) {
		this.jsonStrQuery = jsonStrQuery;
	}
	public int getShowPage() {
		return showPage;
	}
	public void setShowPage(int showPage) {
		this.showPage = showPage;
	}
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	@Override
	public String toString() {
		return "CustuerWebModel [jsonStrQuery=" + jsonStrQuery + ", showPage=" + showPage + ", nowPage=" + nowPage
				+ "]";
	}
	
}
