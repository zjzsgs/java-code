package com.hand.javaio;

import java.io.File;

public class Test03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printFiles(new File("../August06"), 1);
	}

	public static void printFiles(File dir, int tab) {
		if (dir.isDirectory()) {
			File next[] = dir.listFiles();
			for (int i = 0; i < next.length; i++) {
				if (next[i].toString().endsWith(".java")) {
					for (int j = 0; j < tab; j++) {
						System.out.print("|--");
					}
					System.out.println(next[i].getName());
				}
				if (next[i].isDirectory()) {
					printFiles(next[i], tab++);
				}
			}
		}
	}

}
