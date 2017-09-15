package com.hand;

public class test01 {

	/**
	 * 值传递
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		changeValue(num);
		System.out.println(num);
	}
	public static void changeValue(int x){
		x = x*2;
		System.out.println("访问过void");
	}
//	public static int changeValue(int x){
//		x = x*2;
//		System.out.println("访问过int");
//		return x;
//	}

}
