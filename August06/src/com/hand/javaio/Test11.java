package com.hand.javaio;

import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<File> list = FileUtils.getAllFiles("D:");

		// 按文件夹先显示的顺序：
		Collections.sort(list, new Comparator<File>() {
			@Override
			public int compare(File o1, File o2) {
				return (o2.isDirectory() ? 1 : -1)
						- (o1.isDirectory() ? 1 : -1);
			}
		});

		// 按文件名称显示的顺序：
		Collections.sort(list, new Comparator<File>() {
			@Override
			public int compare(File o1, File o2) {
				return (o1.getName()).compareTo(o2.getName());
			}
		});

		// 按文件名称显示的顺序：
		Collections.sort(list, new Comparator<File>() {
			@Override
			public int compare(File o1, File o2) {
				return (int) (o1.length() - o2.length());
			}
		});

		// 遍历集合的文件
		for (File file : list) {
			// 打印排序后的文件或文件夹
			System.out.println(file.getName());
		}
	}

}
