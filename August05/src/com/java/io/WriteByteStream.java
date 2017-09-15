package com.java.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class WriteByteStream {

	/**
	 * 使用字节流写入文件
	 * @param args
	 */
	public static void main(String[] args) {
		try {
//			写出字节流
			FileOutputStream fos = new FileOutputStream("newtxt.txt");
//			要写出的字符串
			String outString = "写出到newtxt";
//			创建字节数组存储outString
			byte output[] = outString.getBytes("UTF-8");
			fos.write(output);
			
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
