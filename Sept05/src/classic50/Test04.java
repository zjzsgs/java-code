package classic50;

import java.util.Scanner;

/**
 * 分解质因数
 * 
 * @author zjz
 * 
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("任意输入一个正整数：");
		long num = sc.nextLong();
		test1(num);

	}

	private static void test1(long num) {
		int k = 2;
		if (num == 1) {
			System.out.println("1不能被分解");
		} else {
			System.out.print(num + "=");
			while (k <= num) {
				if (num % k == 0) {
					if (num != k) {
						System.out.print(k + "*");
					} else {
						System.out.print(k);//不输出最后一个*
					}
					num = num / k;
				} else {
					k++;
				}
			}
			System.out.println();
		}

	}
}
