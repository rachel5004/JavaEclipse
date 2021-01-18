/*
 *   컴파일러가 자동으로 첨부
 *   1. import java.lang.*;
 *             ========== String , System , Math... 
 *   2. 메소드 => void => return을 첨부 
 *   3. 모든 클래스는 생성자를 가지고 있다 
 *      없는 경우에 디폴트 생성자를 첨부 
 *   4. 모든 클래스 생성 (자바의 모든 클래스는 Object상속을 받는다)
 *      class A extends Object
 *              ==============
 *   5. 모든 클래스는 예외처리를 가지고 있다 : 생략할 수 있는 부분 ... 
 *   자바
 *   오라클 
 *   HTML / CSS => 반응형(bootstrap) => JavaScript (JQuery,Ajax)
 *   JSP
 *   SPRING  => XML,Anntation => MyBatis
 *   파이썬 
 */
// Super => a,display(),Object
class Super{
	private int a=10;
	protected int b=20;
	public static int c = 30;   //상속 X 공통사용
	public void display() {
		System.out.println("Super: display() call...");
	}
	public void display1() {
		System.out.println("Super:display() Call...");
		
	}
	public void display2() {
		System.out.println("Super:display() Call...");
		
	}
	public Super() {   //생성자는 상속 X
		System.out.println("Super: 생성자 함수()...");
	}
}
class Sub extends Super{
	private int c=10;
	public Sub() {
//		this.display();           //녹색=public,황색=protected,적색=private
		System.out.println("Sub: 생성자() call...");
	}
	
	// 오버라이딩 : 상속후에 변경 
		/*
		 *   오버라이딩(재정의) : 메소드의 내용 변경  ==> 수정이 용이 : 기능,메소드명,리턴형,매개변수
		 *    1) 상속을 받는다 
		 *    2) 메소드명이 동일 
		 *    3) 매개변수가 동일 
		 *    4) 린턴형이 동일 
		 *    5) 확장은 가능 , 축소는 불가능하다(접근지정어) 
		 *       private < default < protected < public
		 *                 ======= 
		 *                           =========   
		 *     
		 */
	public void display() {
		// overriding
		System.out.println("Sub: display() call...");
	}
	public void display2() {
		System.out.println("Sub:display2() Call...");
		
	}
}
public class MainClass {
	public static void main(String[] args) {
		Super sp = new Super();
		Sub s = new Sub();
		s.display();
		System.out.println("s.b="+s.b);
		s.b=100;
		System.out.println("s.b="+s.b);

        s.display1();
        s.display2();
        sp.display();
	}
}
