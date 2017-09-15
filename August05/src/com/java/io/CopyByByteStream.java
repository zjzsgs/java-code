package com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyByByteStream {

	/**
	 * 使用字节流读写文件
	 * @param args
	 */
	public static void main(String[] args) {
		try {
//			创建字节读取流
			FileInputStream fis = new FileInputStream("animal.mp4");
//			创建字节写入流
			FileOutputStream fos = new FileOutputStream("new_animal.mp4");
			int count=0;//计数读取了多少次
			long before = System.currentTimeMillis();//开始事件
//			创建字节数组作为存储
			byte input[] = new byte[50];//50个字节太小 要循环读写
//			读取字节流到字节数组
//			fis.read(input);//返回读取的长度 若为-1 表示没有
			while(fis.read(input)!=-1){//循环读写
//			从字节数组写入
			fos.write(input);
			count++;
			}
			fis.close();
			fos.close();
			System.out.println(System.currentTimeMillis()-before+"ms");
			System.out.println("读取了"+count+"次");
			System.out.println("Done!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
