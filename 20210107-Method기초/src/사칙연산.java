import java.util.*;
public class ��Ģ���� {
	static int plus(int a, int b) {
		return a+b;
	}
	static int minus(int a, int b) {
		return a-b;
	}
	static int mul(int a, int b) {
		return a*b;
	}
	static double div(int a, int b) {
		return a/(double)b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ����: ");
		int a = sc.nextInt();
		System.out.print("�ι�° ����: ");
		int b = sc.nextInt();
		System.out.print("������ �Է�: ");
		String op = sc.next();
		switch(op) {
		case "+":
			System.out.println(plus(a,b));
			break;
		case "-":
			System.out.println(minus(a,b));
			break;
		case "*":
			System.out.println(mul(a,b));
			break;
		case "/":
			if(b==0)
				System.out.println("0���� ���� �� �����ϴ�");
			else
				System.out.println(div(a,b));
			break;
		default:
			System.out.println("�߸��� �������Դϴ�");
		}
	}
}
