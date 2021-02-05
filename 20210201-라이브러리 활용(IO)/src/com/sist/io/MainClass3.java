package com.sist.io;
import java.io.*;
public class MainClass3 {
	public static void main(String[] args) {
		try {
			
			File file = new File("c:\\javaDev\\student.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			FileOutputStream fos = new FileOutputStream(file);
			// new FileOutputStream(("c:\\javaDev\\student.txt",true);
			//						-> true = append mode, 기존파일에 추가로 작성
			
			fos.write("홍길동".getBytes());
			fos.write("심청".getBytes());
			
			fos.write('A');
			fos.write('B');
			fos.write('C');
			fos.close();
			
		}catch(Exception e) {}
	}
}
