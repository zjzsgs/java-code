package com.java.set;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> s = null;
		s = new TreeSet<String>();
		s.add("E");
		s.add("C");
		s.add("D");
		
		s.add("A");
		s.add("B");
		System.out.println(s);
	}

}
