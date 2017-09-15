package com.hand.javaexam;

import java.util.Scanner;

public class NextDay {
	public static void main(String[] args) {
		System.out.println("请输入一个日期(日期格式为：2015-07-26)：");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String	s= 	str.trim();
		System.out.println(s.length());
		if(s.length()==9||s.length()==10){
			char[] s1 = s.toCharArray();
			
				for (int i = 0; i < s1.length; i++) {
					if(i==4||i==7){
						if(!(s1[i]=='-')){
							System.out.println("输入不合法！");
							break;
						}
					}else if(!(s1[i]>=0&&s1[i]<=9)){
						System.out.println("输入不合法！");
						break;
					}else{
						if(s1[0]==1||s1[0]==2){
							int m = s1[5]*10+s1[6];
							int d = 0;
							if(s1.length==10){
								d = s1[8]*10+s1[9];
							}else{
								d = s1[8];
							}
							switch(m){
								case 1 :
									if(d>=1&&d<=30){
										d=d+1;
										break;
									}else if(d ==31){
										d=1;
										m=m+1;
										break;
									}else{
										System.out.println("输入不合法！");
										break;
									}
								case 2:
									if(d>=1&&d<=27){
										d=d+1;
										break;
									}else if(d ==28){
										d=1;
										m=m+1;
										break;
									}else{
										System.out.println("输入不合法！");
										break;
									}
								case 3:
									if(d>=1&&d<=30){
										d=d+1;
										break;
									}else if(d ==31){
										d=1;
										m=m+1;
										break;
									}else{
										System.out.println("输入不合法！");
										break;
									}
								case 4:
									if(d>=1&&d<=29){
										d=d+1;
										break;
									}else if(d ==30){
										d=1;
										m=m+1;
										break;
									}else{
										System.out.println("输入不合法！");
										break;
									}
								case 5:
									if(d>=1&&d<=30){
										d=d+1;
										break;
									}else if(d ==31){
										d=1;
										m=m+1;
										break;
									}else{
										System.out.println("输入不合法！");
										break;
									}
								case 6:
									if(d>=1&&d<=29){
										d=d+1;
										break;
									}else if(d ==30){
										d=1;
										m=m+1;
										break;
									}else{
										System.out.println("输入不合法！");
										break;
									}
								case 7:
									if(d>=1&&d<=30){
										d=d+1;
										break;
									}else if(d ==31){
										d=1;
										m=m+1;
										break;
									}else{
										System.out.println("输入不合法！");
										break;
									}
								case 8:
									if(d>=1&&d<=30){
										d=d+1;
										break;
									}else if(d ==31){
										d=1;
										m=m+1;
										break;
									}else{
										System.out.println("输入不合法！");
										break;
									}
								case 9:
									if(d>=1&&d<=29){
										d=d+1;
										break;
									}else if(d ==30){
										d=1;
										m=m+1;
										break;
									}else{
										System.out.println("输入不合法！");
										break;
									}
								case 10:
									if(d>=1&&d<=30){
										d=d+1;
										break;
									}else if(d ==31){
										d=1;
										m=m+1;
										break;
									}else{
										System.out.println("输入不合法！");
										break;
									}
								case 11:
									if(d>=1&&d<=29){
										d=d+1;
										break;
									}else if(d ==30){
										d=1;
										m=m+1;
										break;
									}else{
										System.out.println("输入不合法！");
										break;
									}
								case 12:
									if(d>=1&&d<=30){
										d=d+1;
										break;
									}else if(d ==31){
										d=1;
										m=m+1;
										break;
									}else{
										System.out.println("输入不合法！");
										break;
									}
								default:
									System.out.println("输入不合法！");
									break;
							}
							
							System.out.println("下一天为：");
							
						}
						else{
							System.out.println("输入不合法！");
							break;
						}
					}
				}
			
		}else{
			System.out.println("输入不合法！");
		}
		
		
	}
}
