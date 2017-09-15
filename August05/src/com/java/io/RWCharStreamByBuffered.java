package com.java.io;

import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RWCharStreamByBuffered {
	public static void main(String[] args) {
		// File file = new File("txt.txt");
		try {
			// 文件读取字节流
			FileInputStream fis = new FileInputStream("txt.txt");
			// 文件写入字节流
			FileOutputStream fos = new FileOutputStream("new_txt.txt");
			// 将字节流转换成字符流
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			//字符流转换成缓冲流
			BufferedReader br = new BufferedReader(isr);
//			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(osw,true);//加true表示自动flush
			String input;
			while((input=br.readLine())!=null){
//				bw.write(input);//写出时没有换行符
				pw.println(input);//写出有换行符
			}
//			bw.flush();pw.flush();//强制将缓冲区全部写出
			br.close();
			pw.close();
//			bw.close();
			isr.close();
			fis.close();
			osw.close();
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
