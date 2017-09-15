package com.java.oop1;

class Gener{
	public <T>T tell(T t){
		return t;
	}
}
public class GenericDemo05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Gener g = new Gener();
		String str = g.tell("dhudnjfk");
		System.out.println(str);
		int i = g.tell(10);
		System.out.println(i);
	}

}
