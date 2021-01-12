import java.util.*;
public class classingr {
	String name;
	int kor,eng, math;
	int input(String subject) {
		Scanner sc = new Scanner(System.in);
		System.out.println(subject+"점수 입력:");
		return sc.nextInt();
	}
	void input2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력: ");
		kor = sc.nextInt();
		System.out.println("영어 점수 입력: ");
		eng = sc.nextInt();
		System.out.println("수학 점수 입력: ");
		math = sc.nextInt();
	}
	public static void main(String[] args) {
		classingr c = new classingr();
//		c.kor = c.input("국어");
//		c.eng = c.input("영어");
//		c.math = c.input("수학");
		
		c.input2();
		System.out.println("국어점수: "+c.kor);
		System.out.println("영어점수: "+c.eng);
		System.out.println("수학점수: "+c.kor);
		

	}

}
