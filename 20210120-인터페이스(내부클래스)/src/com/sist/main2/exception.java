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
		
//		System.out.println("1�� ����");
//		System.out.println("2�� ����");
//		try {
//			System.out.println("3�� ����");
//			System.out.println("4�� ����");
//			System.out.println(10/0);
//			System.out.println("5�� ����");
//		}catch(Exception ex){
//			System.out.println("6�� ����");
//		}
//		System.out.println("7�� ����");
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
			System.out.println("�迭 ���� �ʰ�");
		}catch(ArithmeticException ae) {
			System.out.println("0���� ���� �� �����ϴ�");
			System.out.println(ae.getMessage());  // ���� ����
			ae.printStackTrace(); //���� ���� ���
		}catch(RuntimeException e) {   //���� ����ó���̹Ƿ� ���߿������ �ȱ׷��� �� �갡 ��ƹ���
			System.out.println("Unexpected error");
		}
		System.out.println("Program end");
	}
}
