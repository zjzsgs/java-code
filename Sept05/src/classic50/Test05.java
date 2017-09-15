package classic50;

import java.util.Scanner;

/**
 * if分层
 * @author zjz
 *
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的成绩：");
		int score = sc.nextInt();
		test1(score);
	}

	private static void test1(int score) {
		if(score>=90){
			System.out.println("A");
		}else if(score>=60){//60分以上就是60——90
			System.out.println("B");
		}else{
			System.out.println("C");
		}
	}
}
