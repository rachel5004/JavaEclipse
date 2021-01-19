// 멤버변수 , 지역변수 => 우선 순위 (지역변수 => 멤버변수) 
		// 지역변수와 멤버변수의 변수명이 동일 => this로 구분 
		// 모든 멤버메소드(인스턴스메소드에는 this가 사용된다) => 구분이 없는 경우는 this생략이 가능 
 //인스턴스가 생성시마다 => 각자 this라는 자신의 객체를 가지고 있다 
		 //   this => 컴파일시에 자동 생성 		


class Student{   //super =  Object
	private int hakbun;    // 청색 = member variable
	private String name;
	private String sex;
//	public void Student(int hakbun, String name, String sex) {  //갈색 = 지역변수
//		this.hakbun =  hakbun; // this = member variable 호출
//		this.name = name;
//		this.sex = sex;
//	}
	public Student(int hakbun, String name, String sex) {  //생성자(시작값을 생성할때 할당)
		this.hakbun =  hakbun;
		this.name = name;
		this.sex = sex;
	}
	public void print() {
		System.out.println("학번: "+hakbun);
		System.out.println("이름: "+name);
		System.out.println("성별: "+sex);
		System.out.println("this="+this);
	}
}
public class MainClass {

	public static void main(String[] args) {
		
//		Student st1 = new Student();
//		System.out.println("s1="+st1);
//		st1.Student(1, "홍길동", "남자");
//		st1.print();
//		Student st2 = new Student();
//		System.out.println("s2="+st2);
//		st2.print();
		
		Student st1 = new Student(1, "홍길동", "남자"); //생성자
		Student st2 = new Student(2, "심청", "여자"); 
		
	}

}
