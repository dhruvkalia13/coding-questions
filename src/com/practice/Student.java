package com.practice;

public class Student {
	private int id;
	private String name;
	private String mobNum;
	
	public String getMobNum() {
		return mobNum;
	}
	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int id, String name, String mobNum) {
		super();
		this.id = id;
		this.name = name;
		this.mobNum = mobNum;
	}
	
	
	

}
