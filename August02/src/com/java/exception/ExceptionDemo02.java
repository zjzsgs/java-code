package com.java.exception;

public class ExceptionDemo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		异常抛给主方法 主方法必须捕获
//		若主方法不捕获 也可以抛出异常 此时交给jvm处理
//		try {
//			tell(10,0);
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e);
//		}
		tell(10,0);
		
	}
	
//	异常抛给主方法
	public static void tell(int i,int j) throws ArithmeticException{
		int temp =0;
		temp = i/j;
		System.out.println(temp);
	}

}
