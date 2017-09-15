package com.java.oop1;

interface Gen1<T>{
	public void say();
}
class Gin implements Gen1<String>{
	private String info;
	public Gin(String info) {
		this.info = info;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}
}
public class GenericDemo04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gin g = new Gin("dnhuo");
		System.out.println(g.getInfo());
	}

}
