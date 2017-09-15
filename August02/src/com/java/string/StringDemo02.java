package com.java.string;

public class StringDemo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		数组比较 true
//		int a=10;int b=10;
//		System.out.println(a==b);
//		字符串比较 不能双等 false 这里比的是内存地址
		String str = "hello";
		String str1 = new String("hello");
		System.out.println(str == str1);
//		字符串内容比较
		System.out.println(str.equals(str1));
	}

}
