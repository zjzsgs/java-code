package com.java.exception;

class Exc{
	int i=10;
	int j=10;
	int k=0;
}

public class ExceptionDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp =0;
		int temp1 =0;
		Exc e = null;
		try {
			temp =e.i/e.j;
			temp1 =e.i/e.k;
			System.out.println(temp);
			System.out.println(temp1);
		} catch (NullPointerException e2) {
			// TODO: handle exception
			System.out.println("空指针异常:"+e2);
		}
		
		
		
		System.out.println("程序退出");
	}

}
