import java.util.*;
public class 사칙연산 {
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
		System.out.print("첫번째 정수: ");
		int a = sc.nextInt();
		System.out.print("두번째 정수: ");
		int b = sc.nextInt();
		System.out.print("연산자 입력: ");
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
				System.out.println("0으로 나눌 수 없습니다");
			else
				System.out.println(div(a,b));
			break;
		default:
			System.out.println("잘못된 연산자입니다");
		}
	}
}
