package com.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class FileDemo06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("txt.txt");
		if(file.exists()){
			System.out.println("文件存在");
			try {
				//创建文件输入流
				FileInputStream fis = new FileInputStream(file);
				//输入流Reader
				InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
				//缓冲输入流
				BufferedReader br = new BufferedReader(isr);
				String line;
				while((line=br.readLine())!=null){
					System.out.println(line);
				}
				br.close();
				isr.close();
				fis.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e){
				e.printStackTrace();
			} catch (IOException e){
				e.printStackTrace();
			}
			
			File newfile = new File("newtxt.txt");
			//创建文件输出流 文件不存在会直接创建
			try {
				FileOutputStream fos = new FileOutputStream(newfile);
				OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write("第一行\n");
				bw.write("第一行\n");
				bw.write("第一行\n");
				bw.write("第一行\n");//覆盖写入
				bw.close();
				osw.close();
				fos.close();
				System.out.println("写入完成，请查看");
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

}
