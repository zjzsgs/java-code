package com.hand.javabase;

/**
 * 9.分析以下需求，并用代码实现： (1)模拟Arrays.toString(int[] arr);方法，自己封装一个public static
 * String toString(int[] arr); (2)如果int类型数组arr为null，toString方法返回字符串"null"
 * (3)如果int类型数组arr长度为0，toString方法返回字符串"[]"
 * (4)如果int类型数组arr的内容为{1,2,3,4,5},toString方法返回字符串"[1, 2, 3, 4, 5]"
 * 
 * @author zjz
 * 
 */
public class Test9 {

	public static void main(String[] args) {
		int[] arr1 = null;
		int[] arr2 = {};
		int[] arr3 = { 1, 2, 3, 4, 5 };
		System.out.println(toString(arr1));
		System.out.println(toString(arr2));
		System.out.println(toString(arr3));
	}

	public static String toString(int[] arr) {
		if (arr == null) {
			return null;
		}
		if (arr.length == 0) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		int i;
		for (i = 0; i < arr.length - 1; i++) {
			sb.append(arr[i] + ",");
		}
		// append不能写成（a[i]+']'）
		sb.append(arr[i]);
		sb.append(']');
		return sb.toString();

	}
}
