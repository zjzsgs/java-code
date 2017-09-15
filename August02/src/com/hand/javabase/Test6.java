package com.hand.javabase;
/**
 * 6.有1、2、3、4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 * @author zjz
 *
 * 
 */
public class Test6 {
	public static void main(String[] args) {
		int count = 0;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				for(int k=1;k<=4;k++){
					if(i!=j&&j!=k&&i!=k){
						System.out.println(100*i+10*j+k);
						count++;
					}
				}
			}
		}
		System.out.println("共有"+count+"个无重复数字的三位数");
	}
}
