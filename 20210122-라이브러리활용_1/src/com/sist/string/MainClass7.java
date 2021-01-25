package com.sist.string;

import java.util.Scanner;

public class MainClass7 {
	public static void main(String[] args) {
		
		String[] menu = {
				"자바와 오라클",
				"자바프로그래밍",
				"혼자 배우는 자바",
				"자바 200제",
				"오라클과 Ajax",
				"Jquery and 자바",
				"HTML5 & CSS3",
				"자바와 파이썬 융합",
				"스프링5와 JSON",
				"자바 기초"
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색어: ");
		String find = sc.next();
		
		for(String s:menu) {
			if(s.contains(find)) {
				System.out.println(s);
				try {
					Thread.sleep(300);
				}catch(Exception e) {}
			}
		}
		
	}
}
