import java.util.*;
public class classingr {
	String name;
	int kor,eng, math;
	int input(String subject) {
		Scanner sc = new Scanner(System.in);
		System.out.println(subject+"���� �Է�:");
		return sc.nextInt();
	}
	void input2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �Է�: ");
		kor = sc.nextInt();
		System.out.println("���� ���� �Է�: ");
		eng = sc.nextInt();
		System.out.println("���� ���� �Է�: ");
		math = sc.nextInt();
	}
	public static void main(String[] args) {
		classingr c = new classingr();
//		c.kor = c.input("����");
//		c.eng = c.input("����");
//		c.math = c.input("����");
		
		c.input2();
		System.out.println("��������: "+c.kor);
		System.out.println("��������: "+c.eng);
		System.out.println("��������: "+c.kor);
		

	}

}
