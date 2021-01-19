package com.sist.main;
//page 375
/*
*    추상 클래스 
*    1. 형식
*       접근지정어  타입  class  className{}
*       ======== ====(final|abstract)
*       public|default
*       
*       public abstract class className
*       {
*           ==============
*             변수 
*              = 멤버변수 (instance)
*              = 공통변수 (static)
*           ==============
*             메소드
*              =========== 먹는다 (개,소,돼지,사람...)
*              = 구현된 메소드 
*                 컴퓨터 / 노트북 / 핸드폰 ==> 파워기 클릭 (필요하면 오버라이딩)
*                 public 리턴형 메소드(매개변수..) => 선언부
*                 {
*                    구현부 
*                 }
*              = 선언된 메소드 ==> 구현이 안된 내용 
*                 기능은 동일 => 구현이 다르다 
*                 public (abstract) 리턴형 메소드(매개변수); => 완성이 안됨 => 상속을 받아서 완성 
*           ==============
*           ==============
*           
*       }
*       특징 
*       ====
*        1) 자신이 메모리할당을 할 수 없다 (미완성된 클래스) => new를 사용할 수 없다
*           abstract class A
*           A a=new A(); (X)
*        2) 상속을 받은 클래스에서 미완성 메소드를 구현해서 사용 
*        3) 추상 클래스는 설계
*           ========= 문제,숙제 , 아이템 
*        4) 공통적으로 적용이 되는 기능만 설정 
*           게시판 (글쓰기,수정,삭제,내용보기,찾기)
*             = 일반게시판
*             = 댓글형 게시판
*             = 갤러리게시판
*             = 묻고답하기
*             = 자료실 
*    2. 사용처 
*        = 요구사항 분석 (마킹) => 위에서 지시 
*          의뢰 => 요구사항 분석 => 필요한 데이터 수집 => UI => 구현 => 테스팅
*                 ==========    ==============    ===   ====   =====
*                   아키텍쳐          DBA          퍼블리셔  웹프로그래머 테스터  
*        = 기능은 동일 => 구현형태가 여러가지 
*          ========= 프로그램에 맞게 구현해서 사용 
*          ========= 여러개의 관련 클래스를 모아서 처리 (클래스를 모아서 한개의 이름으로 제어)
*          ========= 표준화가 된다 (라이브러리)
*/
//추상클래스의 상속 => 단일 상속만 가능 
abstract class print {
	public abstract void list(); 
	public abstract void detail(); 
	public void reserve() {
		System.out.println("예약 가능");
	}
}
class movie extends print{

	@Override
	public void list() {
		System.out.println("영화 포스터");
	}

	@Override
	public void detail() {
		System.out.println("영화 관련 데이터");
	}
	
	
}
class food extends print{

	@Override
	public void list() {
		System.out.println("맛집 테이블");
	}

	@Override
	public void detail() {
		System.out.println("맛집 지도와 메뉴 출력");
	}
	
	
}
class travel extends print{

	@Override
	public void list() {
		System.out.println("포스터 없이 테이블형태로 출력");
	}

	@Override
	public void detail() {
		System.out.println("시간 출력");
	}
	public void reserve() {        // 추상이 아닐 경우는 필요하면 오버라이딩 가능
		System.out.println("항공 시간 예약");
	}
	
}

public class 추상클래스 {
	public static void main(String[] args) {
		print p = new movie();   // 추상클래스 생성은 구현된 자손클래스로 호출
		p.list();
		p.detail();
		p.reserve();
		// 서로 다른 클래스를 연결해서 사용이 가능 
		p = new food();
		p.list();
		p.detail();
		p.reserve();
		
		p = new travel();
		p.list();
		p.detail();
		p.reserve();
	}

}