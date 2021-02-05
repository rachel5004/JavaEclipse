package com.sist.io;
import java.io.*;
public class MainClass7 {
	public static void main(String[] args) {
		try {
			File file = new File("c:\\javaDev\\sawon.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			fw.write("홍길동|개발부|대리|서울\r\n");
			fw.close();
		}catch(Exception e) {}
	}
}
