package com.sist.main2;
import java.util.*;
public class exception {
	public static void main(String[] args) {
//		int a = 10;
//		int b = 2;
//		try {
//			int res = a/b;
//			System.out.println(res);
//		}catch(Exception ex) {
//			System.out.println("error!");
//		}
//		System.out.println("program end");
		
//		System.out.println("1번 문장");
//		System.out.println("2번 문장");
//		try {
//			System.out.println("3번 문장");
//			System.out.println("4번 문장");
//			System.out.println(10/0);
//			System.out.println("5번 문장");
//		}catch(Exception ex){
//			System.out.println("6번 문장");
//		}
//		System.out.println("7번 문장");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("first int: ");
			int a = sc.nextInt();
			System.out.println("second int: ");
			int b = sc.nextInt();
			
			int[] arr = {a,b};
			int res = arr[0]/arr[1];
			System.out.println("res: "+res);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 초과");
		}catch(ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다");
			System.out.println(ae.getMessage());  // 에러 내용
			ae.printStackTrace(); //에러 라인 출력
		}catch(RuntimeException e) {   //상위 에러처리이므로 나중에써야함 안그러면 다 얘가 잡아버림
			System.out.println("Unexpected error");
		}
		System.out.println("Program end");
	}
}
