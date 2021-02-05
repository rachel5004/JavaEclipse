package com.sist.io;
import java.io.*;
public class MainClass6 {
	public static void main(String[] args) {
		try {
			File file = new File("c:\\javaDev\\daum_news.txt");
			FileReader fis = new FileReader(file);   // fileinputstream = 1byte, reader = 2byte
			int i=0;
			
			char[] buffer = new char[1024];
			
			while((i=fis.read(buffer,0,1024))!=-1) {
				System.out.print(buffer);
			}
//			while((i=fis.read())!=-1) {
//				System.out.print((char)i);
//			}
			fis.close();
			
			
//			char[] buffer = {'A','B','C'};
//			System.out.println(buffer);
		}catch(Exception e) {}
	}
}
