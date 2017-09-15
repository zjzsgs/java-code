package com.hand.javabase;

/**
 * 7.不用中间变量交换两个数字的值。
 * 
 * @author zjz 加减法 乘除法 异或法
 */
public class Test7 {
	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		System.out.println("交换之前：");
		System.out.println("i=" + i);
		System.out.println("j=" + j);
		i = i + j;
		j = i - j;
		i = i - j;
		System.out.println("交换之后：");
		System.out.println("i=" + i);
		System.out.println("j=" + j);
	}
}
