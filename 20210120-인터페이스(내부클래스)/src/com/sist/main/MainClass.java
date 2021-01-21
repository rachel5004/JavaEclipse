package com.sist.main;
/*
 *     1. 클래스 종류 
 *     ============
 *       일반 클래스 : 접근지정어 (public , default) 
 *                  옵션 (final , abstract)
 *                  public final
 *                  public abstract
 *                  final
 *                  abstract
 *       ----class className{
 *          =============
 *            기본: private : 외부에서 데이터를 사용하지 못하게 만든다(은닉화) => 캡슐화 
 *                           메소드와 멤버변수를 하나로 연결 사용 (getter/setter)
 *                           변수 : 메모리에 저장(setter) / 메모리에서 읽기 (getter)
 *            옵션: static , final
 *            = 멤버변수 : 여러개를 저장
 *            = static : 저장공간이 한개 ====> 오라클 (정규화)
 *            -----멤버변수 
 *            공통변수 
 *          ===================
 *            기본 : => 역할 : 다른 클래스와 연결(메세지)
 *                               =================
 *                               public 
 *            옵션 : final , static(자동 메모리 할당) , abstract(선언)
 *            동작,기능처리 
 *            -----메소드
 *          ===================
 *             멤버변수의 초기화 (컴파일러가 자동으로 추가(디폴트생성자)
 *             기본 : public => 다른 클래스를 메모리 할당후 사용  ==> 생성자는 상속은 예외
 *             생성자 => 오버로딩이 가능 (여러개의 생성자를 만들 수 있다)
 *            -----생성자
 *          ===================
 *       }
 *       추상 클래스 : 공통점을 모아서 관리 
 *                   메소드 선언 : 기능은 동일 => 처리 방식이 틀릴 경우 
 *                   => 관련된 클래스를 하나로 모아서 관리 
 *       형식)
 *             추상 클래스의 단점 : 자신이 메모리 할당을 할 수 없다 (상속받은 클래스로부터 메모리 주소를 받아서 사용)
 *             ========================================== 미완성 클래스
 *             abstract class A
 *             class B extends A
 *             ==> A a=new A() (X)
 *                 A a=new B()
 *             public abstract class className
 *             {
 *                 ==========================
 *                  변수 (멤버변수,공통변수)
 *                 ==========================
 *                  메소드 : 선언만 된 메소드 => 공통으로 사용하는 기능 
 *                 ==========================
 *                  메소드 : 구현된 메소드 => 컴퓨터 , 노트북 (시작, 종료)
 *                 ==========================
 *                  생성자 
 *                 ==========================
 *             }
 *       인터페이스 : 추상클래스의 일종
 *                  클래스 : 단일 상속
 *                  인터페이스 : 다중 상속
 *                  => 표준화 작업 
 *                  => 서로 다른 클래스를 연결해서 사용 
 *                  형식)
 *                  public interface 인터페이스명{
 *                    =====================
 *                     변수 : 상수형변수 => 선언시에 반드시 값을 저장
 *                           int a;(X)
 *                     (    )int a=10;  ===> public static final (생략)
 *                    =====================
 *                     메소드:선언만 가능 
 *                          void display(); ===> public abstract (생략)
 *                     public void display(); ===> 모든 메소드 public
 *                    =====================
 *                      구현된 메소드 : JDK 1.8이상 (예전에 만든 프로그램은 존재하지 않는다)
 *                      default void display(){} ==> default는 생략할 수 없다 
 *                      ======= default public void display(){} => public생략이 가능
 *                                      ====== 생략이 가능 
 *                    =====================
 *                      구현된 메소드 
 *                      static void display(){} => public 생략이 가능 
 *                      ======= static public void display(){}
 *                    =====================
 *                      => 개발자의 요청에 따라 추가 
 *                      => 인터페이스 : 선언만 한다 , 고정한다 
 *                                    유지보수 : 사용자의 요청
 *                  }
 *                  
 *       내부 클래스 : 익명의 클래스 , 멤버 클래스 (네트워크,쓰레드)
 *         class A
 *         {
 *            변수/메소드 => A,B가 사용이 가능 => static
 *            A가 서버 : 접속시마다 접속자의 IP
 *            class B
 *            {
 *               A가 가지고 모든 변수,메소드를 사용 => 접속자에게 메세지 전송 (IP)
 *            }
 *         }
 *         
 *         // 가장 쉽게 프로그램 => POJO (상속,구현) => 어노테이션 (구분자)
 *         class A
 *         {
 *              익명 => 상속이 없는 상태에서 오버라이딩 (윈도우,빅데이터)
 *              B b=new B(){
 *                 //B 클래스가 가지고 있는 모든 메소드를 재정의(오버라이딩)을 할 수 있다 
 *              }
 *         }
 *         
 *         class B
 *         {
 *             public void display(){}
 *         }
 *       ========================
 *                  1) 사용자 정의 클래스 
 *                  2) 라이브러리 (자바에서 제공하는 클래스) , 외부업체에서 만든 클래스
 *                                                     mvnrepository.com(스프링)
 *                  ====================================================== 조립 (조립하는 클래스)
 *                  클래스 : 재사용 = 포함,상속(변경해서 사용=오버라이딩)
 *                  
 *                  //ABBA
 */

public class MainClass {

	public static void main(String[] args) {
        
	}

}








