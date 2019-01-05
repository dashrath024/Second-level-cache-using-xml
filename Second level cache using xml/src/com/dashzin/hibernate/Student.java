package com.dashzin.hibernate;

public class Student {
  
	private SID id;
	private String email;
	private long phone;
	
	public SID getId() {
		return id;
	}
	public void setId(SID id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
}
