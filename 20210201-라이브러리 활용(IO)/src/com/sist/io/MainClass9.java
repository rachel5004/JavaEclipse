package com.sist.io;
// BufferedReader : 네트워크 보조스트림
import java.io.*;


public class MainClass9 {
	public static void main(String[] args) {
	try {
		
		// string , stringbuffer 속도비교
//		File file = new File("c:\\javaDev\\daum_movie.txt");
//		FileReader fr = new FileReader(file);
//		
//		int i=0;
//		
//		long start = System.currentTimeMillis();
//		//String data="";
//		StringBuffer sb = new StringBuffer(); // 읽은 데이터 임시 저장공간
//		
//		while((i=fr.read())!=-1) {
//			//data+=String.valueOf((char)i);
//			sb.append(String.valueOf((char)i));
//		}
//		//System.out.println(data);
//		System.out.println(sb.toString());
//		long end = System.currentTimeMillis();
//		System.out.println("걸린 시간: "+(end-start));
		
		
		File file = new File("c:\\javaDev\\daum_movie.txt");
		FileInputStream fis = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		
		long start = System.currentTimeMillis();
		while(true) {
			String str =  br.readLine();
			if(str==null) break;
			System.out.println(str);
		}
		br.close();
		long end = System.currentTimeMillis();
		System.out.println("걸린 시간: "+(end-start));
	}catch(Exception e) {}
	}
}
