package com.hand.javabase;

/**
 * 8.利用阶乘计算1!+2!+...+10!
 * 
 * @author zjz
 * 
 *         内部循环计算每个数的阶乘 外部循环计算阶乘的和
 */
public class Test8 {
	public static void main(String[] args) {

		int s = 0;
		for (int i = 1; i <= 10; i++) {
			int m = 1;
			for (int j = 1; j <= i; j++) {
				m = m * j;
			}
			s = s + m;
		}
		System.out.println(s);
	}

}
