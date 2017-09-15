package com.java.list;

import java.util.List;
import java.util.Vector;

public class ListDemo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> lists =null;
		lists = new Vector<String>();
		lists.add("A");
		lists.add("B");
		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i));
		}
		lists.remove(0);
		System.out.println(lists.isEmpty());
		System.out.println(lists.indexOf("A"));
	}

}
