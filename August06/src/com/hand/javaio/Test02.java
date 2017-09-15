package com.hand.javaio;

import java.io.File;
import java.util.Scanner;

public class Test02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入所要遍历的目录(格式为“D:\\one\\two”)：");
		Scanner sc = new Scanner(System.in);
		String path = sc.next();
		File folder = new File(path);
		printFiles(folder,1);
		
	}
	
	public static void printFiles(File dir,int tab){
		if(dir.isDirectory()){
			File next[] = dir.listFiles();
			for (int i = 0; i < next.length; i++) {
				for (int j = 0; j < tab; j++) {
					System.out.print("|--");
				}
				System.out.println(next[i].getName());
				if(next[i].isDirectory()){
					printFiles(next[i],tab++);
				}
			}
		}
	}

}
