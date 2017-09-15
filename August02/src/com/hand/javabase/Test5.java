package com.hand.javabase;

/**
 * 5.打印出如下图案（菱形）
 * 
 *** 
 ****** 
 ******** 
 ****** 
 *** 
 * 
 * 
 * @author zjz 可以用for一行一行打印 而每一行都看作是空格加* 他们都有递减递增规律
 */
public class Test5 {

	public static void main(String[] args) {
		int row = 7;
		for (int i = 1; i <= (row + 1) / 2; i++) {
			for (int a = 1; a <= (row + 1) / 2 - i; a++) {
				System.out.print(" ");
			}
			for (int b = 1; b <= i * 2 - 1; b++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = (row + 1) / 2 - 1; i > 0; i--) {
			for (int a = 1; a <= (row + 1) / 2 - i; a++) {
				System.out.print(" ");
			}
			for (int b = 1; b <= i * 2 - 1; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
