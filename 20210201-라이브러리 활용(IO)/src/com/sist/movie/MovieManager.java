package com.sist.movie;
import java.io.*;
import java.util.*;
public class MovieManager {
	private static ArrayList<MovieVO> list = new ArrayList<MovieVO>();
	static {
		try {
			
			// read file
			FileInputStream fis = new FileInputStream("c:\\download\\movie.txt");
			//객체단위로 변경(역직렬화)
			ObjectInputStream ois = new ObjectInputStream(fis);
			list = (ArrayList<MovieVO>) ois.readObject();
			ois.close();
			
		}catch(Exception e){}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		for(MovieVO vo:list) {
//			System.out.println(vo.getMno());
//			System.out.println(vo.getTitle());
//			System.out.println(vo.getDirector());
//			System.out.println(vo.getActor());
//			System.out.println("==================");
//		}
//		
//		// 테마별 검색
//		String[] menu = {"1. 현재 상영",
//						"2. 개봉 예정",
//						"3. 박스오피스(주간)",
//						"4. 박스오피스(월간)",
//						"5. 박스오피스(연간)"
//						};
//		
//		System.out.println("=========menu=========");
//		for(String s:menu) {
//			System.out.println(s);
//		}
//		System.out.println("======================");
//		System.out.print("select menu: ");
//		int idx = sc.nextInt();
//		for (MovieVO vo:list) {
//			if(vo.getCno()==idx) {
//				System.out.println(vo.getMno());
//				System.out.println(vo.getTitle());
//				System.out.println(vo.getDirector());
//				System.out.println(vo.getActor());
//				System.out.println("==================");
//			}
//		}
//		
//		//장르별 검색
//		System.out.print("장르 입력: ");
//		String genre = sc.next();
//		for (MovieVO vo:list) {
//			if(vo.getGenre().contains(genre)) {
//				System.out.println(vo.getMno());
//				System.out.println(vo.getGenre());
//				System.out.println(vo.getTitle());
//				System.out.println(vo.getDirector());
//				System.out.println(vo.getActor());
//				System.out.println("==================");
//			}
//		}
//		
//		// 영화 제목
//		System.out.print("제목 입력: ");
//		String title = sc.next();
//		for (MovieVO vo:list) {
//			if(vo.getTitle().contains(title)) {
//				System.out.println(vo.getMno());
//				System.out.println(vo.getTitle());
//				System.out.println(vo.getDirector());
//				System.out.println(vo.getActor());
//				System.out.println("==================");
//			}
//		}
		
		// detail
		System.out.print("1~219 번호 선택: ");
		int detail = sc.nextInt();
		MovieVO vo=list.get(detail-1);
		System.out.println(vo.getMno());
		System.out.println(vo.getTitle());
		System.out.println(vo.getGenre());
		System.out.println(vo.getDirector());
		System.out.println(vo.getActor());
	}

}
