package com.ahamojo.www.example.service;

import java.util.Date;

public class Conference {
	private String name;
	private Date date;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Conference [name=" + name + ", date=" + date + "]";
	}

}
