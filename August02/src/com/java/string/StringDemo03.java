package com.java.string;

public class StringDemo03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		String str1 = str+"World";
//		改变的是指向堆内存的地址 内容没变
		System.out.println(str1);
	}

}
