package com.java.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "hello");
		map.put("key2", "hellopoo");
		map.put("key3", "hello");
		map.put("key4", "hellopp");
		map.put("key5", "hellkko");
		map.put("key6", "hellolll");
		Set<String> s = map.keySet();
		Iterator<String> i = s.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		Collection<String> c = map.values();
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
