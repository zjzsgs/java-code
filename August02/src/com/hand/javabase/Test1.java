package com.hand.javabase;

import java.util.Scanner;

public class Test1 {

	/**
	 * 1：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子， 小兔子长到第三个月后每个月又生一 对兔子，
	 * 假如兔子都不死，问每个月的兔子总数为多少？
	 * 
	 * @param args
	 *            找规律 每个月兔子的对数是：1，1，2，3，5，8，13，…… 可以发现Sn = Sn-1 + Sn-2
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long s = 1;
		System.out.println("你想知道多少的月份的兔子增殖情况：");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = 1; i <= x; i++) {
			s = getSum(i);
			System.out.println("第" + i + "个月份有" + s * 2 + "只兔子");
		}

	}

	private static int getSum(int i) {
		// TODO Auto-generated method stub
		if (i == 1 || i == 2) {
			return 1;
		} else {
			return getSum(i - 1) + getSum(i - 2);
		}
	}

}
