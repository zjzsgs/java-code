package com.java.oop1;

class Person{
	String name;
	static String country="北京";
	
	public static void setCountry(String country) {
		Person.country = country;
	}
	public Person(String name){
		this.name = name;
	}
	public void print(){
		System.out.println("姓名："+name+"	出生地："+country);
	}
}
public class StaticDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1 = new Person("zhangsan");
//		静态属性最好用类名调用
//		Person.country = "上海";
		Person.setCountry("上海");
		p1.print();
		Person p2 = new Person("lisi");
//		p2.country = "上海";
		p2.print();
		Person p3 = new Person("wangwu");
//		p3.country = "上海";
		p3.print();
	}

}
