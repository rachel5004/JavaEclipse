package com.sist.string;
import java.util.*;
public class MainClass2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("String: ");
//		String msg = sc.next();
//		System.out.println("msg: "+msg);
//		System.out.println("문자개수: "+msg.length());
		
		String msg="";
		// 문자열 뒤집기
//		msg = sc.next();
//		for(int i=msg.length()-1;i>=0;i--) {
//			System.out.print(msg.charAt(i));
//		}
		
		// 문자열 대칭확인
		
		while(true) {    // 문자열 조건(짝수)
			msg = sc.next();
			if(msg.length()%2!=0) {
				System.out.println("짝수의 문자 필요");
				continue;
			}
			break;
		}
		
		boolean bCheck = true;
		for(int i=0;i<msg.length()/2;i++) {
			if(msg.charAt(i)!=msg.charAt(msg.length()-i-1)) {
				bCheck = false;
				break;
			}
		}
		System.out.println((bCheck?"같다":"다르다"));
		
	}
}
