package com.java.file;

import java.io.File;

public class FileDemo02 {

	/**
	 * 文件夹的操作
	 * @param args
	 */
	public static void main(String[] args) {
//		File folder = new File("my new folder/one/two/three");
//		if(folder.mkdirs()){
//			System.out.println("文件夹创建完成");
//		}else{
//			if(folder.exists()){
//				System.out.println("文件夹已经存在不用创建");
//			}else{
//				System.out.println("文件夹创建失败");
//			}
//		}
		//处于同一分区
//		File folder = new File("my new folder_new/one/two");
//		File newfolder = new File("my new folder_new/two");
//		if(folder.renameTo(newfolder)){
//			System.out.println("Done");
//		}else{
//			System.out.println("Fail");
//		}
		File folder = new File("my new folder_new/two");
		if(folder.delete()){
			System.out.println("文件夹删除成功");
		}else{
			System.out.println("文件夹删除失败");
		}
		
		
	}

}
