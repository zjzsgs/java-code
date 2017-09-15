package com.java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class MultiWriteFile {

	static File file = new File("txt.txt");
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		if(file.exists()){
//			file.delete();//如果已经存在 就先删除
//		}
//		new WriteFile(file,1).start();//启动线程
//		new WriteFile(file,4).start();
//		new WriteFile(file,3).start();
//		new WriteFile(file,2).start();
		try {
			RandomAccessFile raf = new RandomAccessFile(file, "r");
			raf.seek(300);
			byte[] str = new byte[20];
			raf.read(str);
			String in = new String(str);
			System.out.println(in);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
