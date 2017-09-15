package com.java.array;

public class ArrayDemo05 {

	/**
	 * 二维数组
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		动态初始化
		int arr[][] = new int[5][5];//声明和实例化 分配内存
		arr[0][0] = 34;
		arr[2][2] = 34;
		arr[3][1] = 34;
//		每一行
		for (int i = 0; i < arr.length; i++) {
//			每一列
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
