package com.hand.javaexam;

import java.util.Scanner;

public class IncomeTax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("请输入工资：");
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		System.out.println("所需缴纳的税费为：" + tax(salary));

	}

	private static float tax(int salary) {
		float tax = 0;
		if (salary <= 3500) {
			return 0;
		} else {
			int s = salary - 3500;
			float a = (float) (0.03 * s);
			float b = (float) (a + 0.1 * (s - 1500));
			float c = (float) (b + 0.2 * (s - 4500));
			float d = (float) (c + 0.25 * (s - 9000));
			float e = (float) (d + 0.3 * (s - 35000));
			float f = (float) (e + 0.35 * (s - 55000));
			float g = (float) (f + 0.45 * (s - 80000));

			if (s <= 1500) {
				tax = a;
			} else if (s > 1500 && s <= 4500) {
				tax = b;
			} else if (s > 4500 && s <= 9000) {
				tax = c;
			} else if (s > 9000 && s <= 35000) {
				tax = d;
			} else if (s > 35000 && s <= 55000) {
				tax = e;
			} else if (s > 55000 && s <= 80000) {
				tax = f;
			} else if (s > 80000) {
				tax = g;
			}
			return tax;
		}
		
	}

}
