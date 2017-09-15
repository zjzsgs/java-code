package com.java.oop1;

class Info<T>{
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getValue().toString();
	}
}
public class GenericDemo03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info<String> i = new Info<String>();
		i.setValue("djbiubd");
		tell(i);
	}
	/**
	 * 通配符
	 * @param i
	 */
	public static void tell(Info<?> i){
		System.out.println(i);
	}

}
