package com.java.array;

public class ArrayDemo03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={23,45,24,54,32};
		int max,min;
		max=min=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("最大值："+max);
		System.out.println("最小值："+min);
	}

}
