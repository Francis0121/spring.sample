package com.base.mvc.data.entity;

import java.util.Date;

public class User {

	private Long userId;
	private String name;
	private Date createDate;

	public User() {}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("User{");
		sb.append("userId=").append(userId);
		sb.append(", name='").append(name).append('\'');
		sb.append(", createDate=").append(createDate);
		sb.append('}');
		return sb.toString();
	}
}
