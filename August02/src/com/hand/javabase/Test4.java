package com.hand.javabase;

import java.util.Scanner;

/**
 * 4.输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 * 
 * @author zjz
 * 
 */

public class Test4 {
	public static void main(String[] args) {
		int letter = 0;
		int space = 0;
		int digit = 0;
		int other = 0;
		System.out.println("请输入字符串：");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ((c > 'a' & c < 'z') || (c > 'A' & c < 'Z')) {
				letter++;
			} else if (c == ' ') {
				space++;
			} else if (c >= '0' & c <= '9') {
				digit++;
			} else {
				other++;
			}
		}
		System.out.println("英文字母个数：" + letter);
		System.out.println("空格的个数：" + space);
		System.out.println("数字的个数：" + digit);
		System.out.println("其他字符个数：" + other);
	}
}
