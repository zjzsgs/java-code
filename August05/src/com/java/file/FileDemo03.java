package com.java.file;

import java.io.File;

public class FileDemo03 {

	/**
	 * 文件属性的读取
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("txt.txt");
//		判断文件是否存在
		System.out.println(file.exists());
//		读去文件名称
		System.out.println(file.getName());//输出的是创建文件时指定的名称
//		读取文件路径
		System.out.println(file.getPath());
//		读取文件绝对路径
		System.out.println(file.getAbsolutePath());
//		获取文件父级路径
		System.out.println(new File(file.getAbsolutePath()).getParent());
//		读取文件大小
		System.out.println(file.length()+"byte");
		System.out.println((float)file.length()/1000+"KB");
//		判断文件是否被隐藏
		System.out.println(file.isHidden());
//		判断文件是否可读
		System.out.println(file.canRead());
//		判断文件是否可写
		System.out.println(file.canWrite());
//		判断文件是否为文件夹
		System.out.println(file.isDirectory());
	}

}
