package com.ispmj.lv.manager.vo;

import com.ispmj.base.vo.BaseModel;

/**
 *@author piaomj *
 *@date 2017-05-10 
 *@des 商品VO**/
public class Customer extends BaseModel {
	private int  uuid;//生成序列
	private String	 customerId;//客户id
	private String pwd;	//客户密码
	private String showName;//显示昵称
	private String trueName;//真实姓名
	private String tel;//客户电话
	private String email;//客户邮箱
	private String card;//客户身份证
	private String registerTime;//注册时间
	public int getUuid() {
		return uuid;
	}
	public void setUuid(int uuid) {
		this.uuid = uuid;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + uuid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (uuid != other.uuid)
			return false;
		return true;
	}
	public Customer(String customerId, String pwd, String showName, String trueName, String tel, String email,
			String card, String registerTime) {
		super();
		this.customerId = customerId;
		this.pwd = pwd;
		this.showName = showName;
		this.trueName = trueName;
		this.tel = tel;
		this.email = email;
		this.card = card;
		this.registerTime = registerTime;
	}
	public Customer() {
		super();
	}
	
	
}
