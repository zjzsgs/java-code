package com.java.file;

import java.io.File;

public class FileDemo05 {

	/**
	 * 遍历文件夹
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		printFiles(new File("D:\\05、Git"),1);
		printFiles(new File("../August05"),1);
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
