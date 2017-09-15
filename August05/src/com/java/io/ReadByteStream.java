package com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadByteStream {

	/**
	 * 使用字节流读取问价 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
//			读取字节流
			FileInputStream fis = new FileInputStream("txt.txt");
//			创建字节数组存储
			byte input[] = new byte[21];
//			读取到字节数组中
			fis.read(input);
//			解码
			String inputString = new String(input,"UTF-8");
//			将字节数组转成字符串输出
			System.out.println(inputString);
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
