package com.sist.io;
import java.io.*;
// 메모리,파일,네트워크 입출력 클래스 집합

/*
 * -File
 *  	1.file 객체 생성
 *  	File file = new File("c:\\폴더명\\파일명")
 *  
 *  	File dir = new File("c:\\폴더명)
 *  	File file = new File(dir,"파일명")
 *  	
 */

public class MainClass {
	public static void main(String[] args) {
		
		File dir = new File("c:\\download");
		if(!dir.exists()) {
			dir.mkdir();
		}
		// 폴더 안 파일의 종류
		File[] files = dir.listFiles();
		for(File f:files) {
			if(f.isFile()) {  // 파일
				System.out.println(f.getName());
			}
			if(f.isDirectory()) { // 폴더
				System.out.println(f.getName()+" DIR");
			}
		}		
		// 폴더 삭제
		dir.delete();    // 폴더 안에 파일이 있으면 삭제불가
		for(File f:files) {
			if(f.isFile()) {  // 파일
				f.delete();
			}
			if(f.isDirectory()) { // 폴더
				File dir2 = new File("c:\\download\\"+f.getName());
				File[] files2 = dir2.listFiles();
				for(File ff:files2) {
					ff.delete();
				}
				dir2.delete();
			}
		}
		dir.delete();
			
	}
}