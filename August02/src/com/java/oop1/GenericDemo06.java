package com.java.oop1;

public class GenericDemo06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer arr[] = {1,2,3,4,5,6};
		tell(arr);
	}
	public static <T>void tell(T arr[]){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
