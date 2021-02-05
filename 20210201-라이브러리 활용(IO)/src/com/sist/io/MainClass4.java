package com.sist.io;
import java.util.*;
import java.io.*;
public class MainClass4 {
	public static void main(String[] args) {
		try{
			String msg = "efsget ergwtge  gregewrg gystr";
			FileOutputStream fos = new FileOutputStream("c:\\javaDev\\student.txt");
			fos.write(msg.getBytes());
			fos.close();
			System.out.println("1st save");
			
//			// close 했기 때문에 다시 열어줘야함
//			fos = new FileOutputStream("c:\\javaDev\\student.txt",true);
//			fos.write("\nhello".getBytes());
//			fos.close();
//			System.out.println("2nd save");
			
			FileInputStream fis = new FileInputStream("c:\\javaDev\\student.txt");
			int i=0;
			while((i=fis.read())!=-1) {
				System.out.println((char)i);
			}
			fis.close();
		}catch(Exception e) {}
	}
}
