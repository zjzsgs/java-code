package com.hand.javabase;

import java.util.Scanner;

public class Test3 {

	/**
	 * 3.输入两个正整数m和n，求其最大公约数和最小公倍数。
	 * 
	 * @param args
	 *            最小公倍数 = m*n/最大公约数 最大公约数可以用辗转相除法 m%n的余数c如果为0，则最大公约数是n，否则m=n n=c
	 *            重复以上 直到余数为0，此时除数即为最大公约数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入两个数：");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a = m;
		int b = n;
		while (b != 0) {
			int c = a % b;
			a = b;
			b = c;
		}
		System.out.println(m + "和" + n + "的最大公约数是" + a);
		System.out.println(m + "和" + n + "的最小公倍数是" + m * n / a);

	}
}
