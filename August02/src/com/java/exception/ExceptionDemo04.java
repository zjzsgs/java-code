package com.java.exception;

class MyException extends Exception{
	public MyException(String msg){
		super(msg);
	}
}
public class ExceptionDemo04 {

	/**
	 * 自定义异常
	 * @param args
	 */
	
	public static void main(String[] args) {
		try {
			throw new MyException("自定义异常");
		} catch (MyException e) {
			System.out.println(e);
		}
	}

}
