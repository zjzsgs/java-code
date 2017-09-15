package com.hand.javaio;

import java.io.File;
import java.io.FileInputStream;

public class Test04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("test.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			int len = 0;
			byte[] input = new byte[1024];
			StringBuffer sb = new StringBuffer();
			while ((len = fis.read(input)) != -1) {
				sb.append(new String(input, 0, len));
			}
			System.out.println(sb);
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
