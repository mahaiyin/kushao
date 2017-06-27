package com.kushao.entity;

import java.util.Date;

public class Sys {
	private Integer id;
	private String name;
	private String value;
	private Byte status;
	private Date addtime;
	private String remark;

	public Sys() {
		super();
	}

	public Sys(Integer id, String name, String value, Byte status, Date addtime, String remark) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
		this.status = status;
		this.addtime = addtime;
		this.remark = remark;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "[\"id\":" + id + ", \"name\":\"" + name + "\", \"value\":\"" + value + "\", \"status\":" + status
				+ ", \"addtime\":\"" + addtime + "\", \"remark\":\"" + remark + "\"]";
	}
}
