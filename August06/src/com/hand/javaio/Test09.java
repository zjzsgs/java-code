package com.hand.javaio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("D:/txt.txt");
		FileReader fr;
		BufferedReader br;
		String str;
		int n = 0;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while((str = br.readLine())!=null){
				n++;
				System.out.println(n+"."+str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
