package com.java.string;

public class StringBufferDemo03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		for (int i = 0; i < 100; i++) {
			str += i;
			sb.append(i);
		}
		System.out.println(str);
		System.out.println(sb);
	}

}
