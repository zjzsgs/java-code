package com.java.oop1;

class Ref2{
	String temp = "hello";
}
public class RefDemo03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ref2 r1 = new Ref2();
		r1.temp = "world";
		System.out.println(r1.temp);
		tell(r1);
		System.out.println(r1.temp);
		
	}
	public static void tell(Ref2 r2){
		r2.temp = "nihao";
	}

}
