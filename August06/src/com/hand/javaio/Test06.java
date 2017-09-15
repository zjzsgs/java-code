package com.hand.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("D:/head.jpg");
			FileOutputStream fos = new FileOutputStream("D:/IOTest/head.jpg");
			byte input[] = new byte[50];
			while (fis.read(input) != -1) {
				fos.write(input);
			}
			fis.close();
			fos.close();
			System.out.println("拷贝完毕");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
