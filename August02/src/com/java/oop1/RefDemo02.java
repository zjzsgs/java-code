package com.java.oop1;

public class RefDemo02 {

	/**
	 * 字符串不可改变
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello";
		System.out.println(str1);
		tell(str1);
		System.out.println(str1);
	}
	public static void tell(String str2){
		str2 = "world";
	}

}
