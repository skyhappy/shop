package com.ispmj.base.vo;

import com.ispmj.base.pageutil.Page;

public class BaseModel<M> {
	private int uuid;
	
	public int getUuid() {
		return uuid;
	}

	public void setUuid(int uuid) {
		this.uuid = uuid;
	}

	private Page<M> page=new Page<M>();

	public Page<M> getPage() {
		return page;
	}

	public void setPage(Page<M> page) {
		this.page = page;
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
		BaseModel other = (BaseModel) obj;
		if (uuid != other.uuid)
			return false;
		return true;
	}
	
	
	
}
