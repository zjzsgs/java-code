package com.java.oop1;

class People{
	String name;
	int age;
	
	public People() {
		System.out.println("无参数的构造方法");
	}
	public People(String name, int age) {
		this();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void print(){
		System.out.println("姓名："+this.getName()+"	年龄："+this.getAge());
	}
	public void tell(){
		System.out.println(this);
	}
}

public class ThisDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		People p = new People("zhangsan",12);
		p.print();
		People p1 = new People();
		System.out.println(p1);
		p1.tell();
//		在实例化时就调用了无参数的构造方法
//		People p1 = new People();
	}

}
