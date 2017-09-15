package com.java.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo03 {

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
		if(map.containsKey("key12")){
			System.out.println("key存在");
		}else{
			System.out.println("key不存在");
		}
		if(map.containsValue("hello1")){
			System.out.println("value存在");
		}else{
			System.out.println("value不存在");
		}
	}

}
