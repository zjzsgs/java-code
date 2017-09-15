package com.hand.javabase;

import java.util.Scanner;

public class Test2 {

	/**
	 * 2：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
	 * 
	 * @param args
	 *            2是最小的质数，将输入的正整数除以2若整除则将2输出，商继续从2开始 若除以2有余数，则+1继续，重复以上
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个大于1的正整数：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(n + "=");
		int i = 2;
		while (n > i) {
			if (n % i == 0) {
				System.out.print(i + "*");
				n = n / i;
			} else {
				i++;
			}

		}
		System.out.println(i);
	}

}
