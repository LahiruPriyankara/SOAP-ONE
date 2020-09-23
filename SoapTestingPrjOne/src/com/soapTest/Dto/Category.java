package com.soapTest.Dto;

public class Category {
	int cId;
	String cName;
	public Category(){}
	public Category(int id,String name){
		this.cId= id;
		this.cName = name;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

}
