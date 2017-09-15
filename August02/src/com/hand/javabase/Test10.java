package com.hand.javabase;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 10.键盘录入任意一个年份，判断该年是闰年还是平年，不用数学余数计算。
 * @author zjz
 * Java时间操作类
 *  Calendar c = Calendar.getInstance(); 
 *  以3月1日减去1天 看有没有29
 */
public class Test10 {
	public static void main(String[] args) {
		System.out.println("请输入你想知道的年份：");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		if(c.get(Calendar.DAY_OF_MONTH)==29){
			System.out.println("是闰年");
		}else{
			System.out.println("不是闰年");
		}
	}
}
