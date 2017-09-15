package com.java.string;

public class StringBufferDemo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.insert(0, "nihao");
		System.out.println(sb.toString());
		sb.replace(1,5, "yyyyyyy");
		System.out.println(sb);
		System.out.println(sb.indexOf("yy"));
		
	}

}
