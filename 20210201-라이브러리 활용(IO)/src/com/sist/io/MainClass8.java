package com.sist.io;
import java.io.*;
public class MainClass8 {
	public static void main(String[] args) {
		try {
			File file = new File("c:\\javaDev\\eclipse.zip");
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			FileOutputStream fos = new FileOutputStream("c:\\download\\eclipse.zip");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			byte[] buffer = new byte[1024];
			int i=0;
			while((i=bis.read(buffer,0,1024))!=-1) {
				bos.write(buffer,0,i);
			}
			bis.close();
			bos.close();
			System.out.println("downloaded");
			// 웹 다운로드 소스
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
