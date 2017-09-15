package com.java.oop1;

class Gen<K,T>{
	private T take;
	private K key;
	
	public T getTake() {
		return take;
	}
	public void setTake(T take) {
		this.take = take;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	
}
public class GenericDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Gen<String,Integer> g = new Gen<String,Integer>();
		g.setTake(10);
		g.setKey("key");
		System.out.println(g.getTake()+" "+g.getKey());
	}

}
