package com.java.oop1;

class Point<T>{
	private T x;
	private T y;
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
}
public class GenericDemo02 {

	/**
	 * 经纬度
	 * int
	 * float
	 * String
	 * @param args
	 */
	public static void main(String[] args) {
//
//		Point<String> p = new Point<String>();
//		p.setX("经度是：109");
//		p.setY("维度是：110");
//		System.out.println(p.getX()+" "+p.getY());
		Point<Integer> p = new Point<Integer>();
		p.setX(100);
		p.setY(134);
		System.out.println("经度是"+p.getX()+"  维度是"+p.getY());
	}

}
