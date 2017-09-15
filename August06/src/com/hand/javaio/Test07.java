package com.hand.javaio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Test07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			File file = new File("D:/test.txt");
			BufferedReader br = null;
			 try {
				 br = new BufferedReader(new FileReader(file));
		         String tem = null;
		         String value = "";
		         while ((tem = br.readLine()) != null) {
		        	 value = value + tem;
		         	}
		            System.out.println(value);
		            // 将读取的字符串转换成字符数组：
		            char[] c = value.toCharArray();
		            // 定义一个map来存储结果：
		            TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>(Collections.reverseOrder());// TreeMap可排序（传入一个反转比较器）

		            for (int i = 0; i < c.length; i++) {
		                char charSrc = c[i];
		                if (tm.containsKey(charSrc)) { // 判断该键的值是否存在
		                    int count = tm.get(charSrc);
		                    tm.put(charSrc, count + 1);
		                } else {
		                    tm.put(charSrc, 1);
		                }
		            }

		            // 取出Map中的键和值
		            Iterator<Map.Entry<Character, Integer>> titer = tm.entrySet().iterator();
		            while (titer.hasNext()) {
		                Map.Entry<Character, Integer> map = titer.next();
		                char key = map.getKey();
		                int valu = map.getValue();
		                System.out.println(key + "(" + valu + ")");
		            }

		        } catch (Exception e) {
		            System.err.println("文件读取错误");
		        } finally {
		            try {
		                if (br != null) {
		                    br.close();
		                }
		            } catch (Exception e2) {
		                System.err.println("文件关闭错误");
		            }
		        }
		}
	}
