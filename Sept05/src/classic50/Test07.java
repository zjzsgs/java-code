package classic50;

import java.util.Scanner;

/**
 * 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 * @author zjz
 *
 */
public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int adcCount=0;
		int sapceCount=0;
		int numCount=0;
		int otherCount=0;
		char[] ch = str.toCharArray();//字符串转换为字符数组 调用Character自带的判断方法
		for (int i = 0; i < ch.length; i++) {
			if(Character.isLetter(ch[i])){
				adcCount++;
			}else if(Character.isSpaceChar(ch[i])){
				sapceCount++;
			}else if(Character.isDigit(ch[i])){
				numCount++;
			}else{
				otherCount++;
			}
		}
		System.out.println("字母个数："+adcCount);
		System.out.println("空格个数："+sapceCount);
		System.out.println("数字个数："+numCount);
		System.out.println("其它字符个数："+otherCount);
	}
}
