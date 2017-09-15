package com.java.exception;

public class ExceptionDemo03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new Exception("实例化异常对象");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
