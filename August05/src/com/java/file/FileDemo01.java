package com.java.file;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {

	/**
	 * 文件的操作
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("new hello.txt");
		// 是否存在
		if (file.exists()) {
//			// 文件
//			System.out.println(file.isFile());
//			// 路径/文件夹
//			System.out.println(file.isDirectory());
//			file.delete();
//			System.out.println("文件删除成功");
//			文件结构必须处于同意个分区 不能使C：——D:
			File nameto = new File("src/new hello.txt");
			file.renameTo(nameto);
			
		} else {
			System.out.println("文件不存在");
			try {
				file.createNewFile();
				System.out.println("文件已经成功创建");
			} catch (IOException e) {
				System.out.println("文件无法创建");
				e.printStackTrace();
			}
		}
	}

}
