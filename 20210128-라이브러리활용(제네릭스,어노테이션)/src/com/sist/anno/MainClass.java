package com.sist.anno;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("화면 선택: ");
		String page = sc.next();
		MovieManager m = new MovieManager();
		
		
		MovieSystem ms = new MovieSystem();
		ms.movie(page);
		
/*		if(page.equals("홈")) {
			m.movieHome();
		}
		else if(page.equals("목록")) {
			m.movieList();
		}
		if(page.equals("상세")) {
			m.movieDetail();
		}
		else if(page.equals("예매")) {
			m.movieReserve();
		}
		else if(page.equals("검색")) {
			m.movieFind();
		}
		*/
	}
}
