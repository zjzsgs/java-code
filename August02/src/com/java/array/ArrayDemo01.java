package com.java.array;

public class ArrayDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayDemo1 = null;//数组声明
		arrayDemo1 = new int[3];//开辟内存空间 实例化
		for (int i = 0; i < arrayDemo1.length; i++) {
			arrayDemo1[i] = i*2+1;
		}
		for (int i = 0; i < arrayDemo1.length; i++) {
			System.out.println(arrayDemo1[i]);
		}
	}

}
