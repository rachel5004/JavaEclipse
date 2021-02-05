package com.sist.io;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
// file 정보 확인

public class MainClass2 {
	public static void main(String[] args) throws IOException {
		File file = new File("c:\\javaDev\\daum_movie.txt");
		
		System.out.println("=========파일 상세정보=========");
		System.out.println("1. 파일 크기: "+file.length()+"Bytes");
		System.out.println("2. 숨김파일여부: "+file.isHidden());
		System.out.println("3. 읽기전용: "+file.canRead());
		System.out.println("4. 쓰기전용: "+file.canWrite());
		System.out.println("5. 파일명: "+file.getName());
		System.out.println("6. 절대경로: "+file.getParent());
		System.out.println("7. 파일명+경로: "+file.getPath());
		System.out.println("8. 파일여부: "+file.isFile());
		System.out.println("9. 수정일: "+new SimpleDateFormat("yyyy-MM--dd hh:mm:ss").
										format(new Date(file.lastModified())));
		
		File create_file = new File("c:\\javaDev\\naver_movie.txt");
		System.out.println("10. 새로운 파일 생성: "+create_file.createNewFile());
		System.out.println("11. 파일 삭제: "+create_file.delete());
		
	}
}
