package com.hand.javaio;

import java.io.File;
import java.io.FileOutputStream;

public class Test05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("test.txt");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			fos.write("HelloJavaWorld你好世界".getBytes());
			fos.flush();
			fos.close();
			System.out.println("写入成功");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
