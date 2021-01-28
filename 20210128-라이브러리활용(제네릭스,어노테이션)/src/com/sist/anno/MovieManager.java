package com.sist.anno;

public class MovieManager {
	@RequestMapping("홈")
	public void movieHome() {
		System.out.println("영화 홈입니다");
	}
	@RequestMapping("목록")
	public void movieList() {
		System.out.println("영화 목록입니다");	
		}
	@RequestMapping("상세")
	public void movieDetail() {
		System.out.println("영화 상세보기입니다");
	}
	@RequestMapping("예매")
	public void movieReserve() {
		System.out.println("영화 예매입니다");
	}
	@RequestMapping("검색")
	public void movieFind() {
		System.out.println("영화 검색입니다");
	}
	@RequestMapping("종료")
	public void movieEnd() {
		System.out.println("영화 사이트 종료");
	}
}
