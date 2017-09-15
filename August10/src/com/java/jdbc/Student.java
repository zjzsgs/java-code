package com.java.jdbc;

public class Student {
	private int id;
	private String name;
	private String sex;
	private String age;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Student( String name, String sex, String age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}	
}
