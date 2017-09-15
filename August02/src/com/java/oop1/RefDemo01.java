package com.java.oop1;

class Ref1{
	int temp = 10;
}
public class RefDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ref1 r1 = new Ref1();
		r1.temp = 20;
		System.out.println(r1.temp);
		tell(r1);
		System.out.println(r1.temp);
	}

	private static void tell(Ref1 r1) {
		// TODO Auto-generated method stub
		r1.temp=30;
	}

}
