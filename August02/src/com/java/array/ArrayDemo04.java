package com.java.array;

public class ArrayDemo04 {

	/**
	 * 冒泡排序
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={12,34,21,42,33};
//		n个数只需要比较n-1次
		for (int i = 0; i < arr.length-1; i++) {
//			每比较一轮就将最大数提到最前
			for (int j = i+1; j < arr.length; j++) {
//				将较大的数换到前面
				if(arr[i]<arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print("第"+(i+1)+"次排序：");
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
