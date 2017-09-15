package com.java.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("E");
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("A");
		list.add("D");
		list.add("F");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()){
			list.remove(2);
			System.out.println(iter.next());
		}
		/**
		 * List Set
		 */
	}

}
