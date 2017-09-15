package com.java.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {

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
		System.out.println(map.get("key1"));
	}

}
