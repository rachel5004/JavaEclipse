package com.sist.io;
// file copy(upload) => FileInputStream,FileOutputStream
// file read,write  => FileReader,FileWriter
import java.io.*;
public class MainClass5 {
	public static void main(String[] args) {
		try {
			File dir = new File("c:\\download");
			if(!dir.exists()) {
				dir.mkdir();
			}
			
			File file = new File("c:\\javaDev\\back.jpg");
			FileInputStream fis = new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream(dir+"\\"+file.getName());
		
			int i=0;
			byte[] buffer = new byte[1024];
			while((i=fis.read(buffer, 0, 1024))!=-1) {
				fos.write(buffer,0,i);
			}
			fis.close();
			fos.close();
			System.out.println("copy clear");
		
		}catch(Exception e) {}
	}

}
