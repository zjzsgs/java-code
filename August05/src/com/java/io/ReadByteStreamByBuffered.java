package com.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadByteStreamByBuffered {

	/**
	 * 使用缓冲区读写字节流
	 * @param args
	 */
	public static void main(String[] args) {
		try {
//			文件读取流
			FileInputStream fis = new FileInputStream("animal.mp4");
//			文件读取缓冲流
			BufferedInputStream bis = new BufferedInputStream(fis,1000000);
//			文件写入流
			FileOutputStream fos = new FileOutputStream("new_animal.mp4");
//			文件写入缓冲流
			BufferedOutputStream bos = new BufferedOutputStream(fos,1000000);
			
			int count=0;//计数读取了多少次
			long before = System.currentTimeMillis();//开始事件
//			创建字节数组存储读取流
			byte input[] = new byte[200];//字节数组长度大文件大些 小文件小些
			while(bis.read(input)!=-1){
				bos.write(input);
				count++;
			}
			bis.close();
			fis.close();
			bos.close();
			fos.close();
			System.out.println(System.currentTimeMillis()-before+"ms");
			System.out.println("读取了"+count+"次");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
