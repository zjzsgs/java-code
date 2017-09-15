package com.java.file;

import java.io.File;

public class FileDemo04 {

	/**
	 * 文件属性的设置
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("txt.txt");
//		将文件设置为可写
		file.setWritable(true);
//		将文件设置为可读
		file.setReadable(true);
//		将文件设置为只读
		file.setReadOnly();
	}

}
