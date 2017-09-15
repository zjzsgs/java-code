package com.java.io;

//import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class RWByCharStream {

	/**
	 * 使用字符流读写数据
	 * @param args
	 */
	public static void main(String[] args) {
//		File file = new File("txt.txt");
		try {
//			文件读取字节流
			FileInputStream fis = new FileInputStream("txt.txt");
//			文件写入字节流
			FileOutputStream fos = new FileOutputStream("new_txt.txt");
//			将字节流转换成字符流
			InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
			OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
//			创建字符型数组
			char input[] = new char[100];
			int l = 0;
//			读取到字符数组中
			while((l=isr.read(input))!=-1){
				
				System.out.println(new String(input,0,l));
				osw.write(input,0,l);
			}
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
