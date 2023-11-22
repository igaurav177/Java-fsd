package com.example;

public class StudentPojo {
	private String sid;
	private String sName;
	private String sEmail;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	@Override
	public String toString() {
		return "[sid=" + sid + ", sName=" + sName + ", sEmail=" + sEmail + "]";
	}
	
	

}
