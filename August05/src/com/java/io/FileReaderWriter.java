package com.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("txt.txt");
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter("new_txt.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			String line;
			while((line = br.readLine())!=null){
				bw.write(line+"\n");//添加换行符 或用printWriter
			}
			bw.flush();//将BufferedReader强制输出
			bw.close();
			fw.close();
			br.close();
			fr.close();
			System.out.println("Done!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
