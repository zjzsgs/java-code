package com.java.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> s = null;
		s = new HashSet<String>();
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		s.add("E");
		System.out.println(s);
	}

}
