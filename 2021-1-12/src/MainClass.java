// 매개변수 전송 
// 값만 전송하는 방식 (기본데이터형)
// 주소를 전송하는 방식 (배열,클래스=> 넘겨준 주소의 데이터를 변경) : String은 예외 (String은 기본데이터형과 유사)
/*
 *    데이터형 (자료형)
 *      = 기본데이터형 (자바에서 지원하는 데이터타입)
 *      = 사용자 데이터형 (배열,클래스) : 상속
 */

/*
 *   ========== 객체 지향 프로그램 ==================
 *    클래스를 만드는 목적 
 *    ================
 *     1. 재사용이 가능 (상속,포함)
 *     2. 클래스가 가지고 있는 데이터를 보호 (캡슐화)
 *     3. 변경이 가능 , 추가가 가능 (다형성)
 *        ============================
 *          유지보수 
 *          ====== 신뢰성 
 *    ============================================ 
 *    
 *    클래스의 구성요소 
 *    ==============
 *      변수 (page 246)
 *      ============================================================
 *        = 인스턴스변수 : new를 이용할때마다 따라 메모리가 생성 
 *        = 공유변수,클래스변수 : static => 컴파일시에 자동으로 메모리 생성  
 *      =================================클래스 블럭안에서 생성
 *        = 지역변수 : 메소드 {} 안에서 생성 
 *      메소드 : 한가지 기능을 수행하는 명령문의 집합
 *      생성자
 */

class music {
	String title, singer;

	void print() {
		System.out.println("노래명: " + title);
		System.out.println("가수명: " + singer);
	}
}

class data {
	int x = 10;
	int y = 20;
}

class datasend {

	void swap(int x, int y) {
		int tmp = x;
		x = y;
		y = tmp;
		System.out.println(x + " " + y);
	}

	void swap(int[] arr) {
		int tmp = arr[0];
		arr[0] = arr[1];
		arr[1] = tmp;
		System.out.println(arr[0] + " " + arr[1]);
	}

	void swap(data d) {
		int tmp = d.x;
		d.x = d.y;
		d.y = tmp;
		System.out.println(d.x + " " + d.y);
	}

	void swap(String s1, String s2) {
		String temp = s1;
		s1 = s2;
		s2 = temp;
		System.out.println(s1 + " " + s2);
	}
}

public class MainClass {
	public static void main(String[] args) {
		music m1 = new music();
		m1.title = "aaa";
		m1.singer = "bbb";

		music m2 = new music();
		m2.print();

		music m3 = m1;
		m3.print();


		
		data d = new data();
		datasend ds = new datasend();

		String s1 = "Hello";
		String s2 = "Java";
		
		System.out.println("s1=" + s1 + ",s2=" + s2);
		ds.swap(s1, s2);
		System.out.println("변경후:s1=" + s1 + ",s2=" + s2);

		int x = 10, y = 20;
		System.out.println("x=" + x + ",y=" + y);

		ds.swap(x, y);
		System.out.println("변경후:x=" + x + ",y=" + y);

		int[] arr = { 10, 20 };
		System.out.println("arr[0]=" + arr[0] + ",arr[1]=" + arr[1]);
		ds.swap(arr);
		System.out.println("변경후:arr[0]=" + arr[0] + ",arr[1]=" + arr[1]);

		System.out.println("d.x=" + d.x + ",d.y=" + d.y);
		ds.swap(d);
		System.out.println("변경후:d.x=" + d.x + ",d.y=" + d.y);

	}

}
