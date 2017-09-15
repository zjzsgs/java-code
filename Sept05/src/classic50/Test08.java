package classic50;

import java.util.Scanner;

/**
 * 题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，
 * 几个数相加有键盘控制。
 * 
 * @author zjz
 * 
 */
public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个数，一个是a，一个是位数：");// 可以输入多个数 只要有接收 空格 回车
		int a = sc.nextInt();
		int n = sc.nextInt();
		int sum=0;
		for (int i = 0; i < n; i++) {
			sum += a*f(i);
		}
		System.out.println(sum);
	}

	private static int f(int i) {
		if(i==0){
			return 1;
		}
		return (int) (Math.pow(10,i)+f(--i));//递归
	}

}
