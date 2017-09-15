package com.hand.javaio;

import java.io.File;
import java.io.IOException;

public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = null;
		File folder = null;
		try {
			file =new File("D:\\HelloWorld.txt");
			file.createNewFile();
			System.out.println("文件创建成功");
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(file.isFile()){
			System.out.println("创建的是文件");
			folder = new File("D:\\IOTest");
			folder.mkdirs();
			System.out.println("文件夹IOTest创建成功");
		}else{
			System.out.println("创建的是目录");
		}
		if(file.renameTo(new File("D:\\IOTest\\HelloWorld.txt"))){
			System.out.println("文件移动成功");
		}else{
			System.out.println("文件移动失败");
		}
		String files[]=folder.list();
		System.out.println("目录下的文件有：");
		for(String f:files){
			System.out.println(f);
		}
		
		
	}

}
