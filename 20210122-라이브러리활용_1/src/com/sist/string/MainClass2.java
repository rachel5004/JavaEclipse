package com.sist.string;
import java.util.*;
public class MainClass2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("String: ");
//		String msg = sc.next();
//		System.out.println("msg: "+msg);
//		System.out.println("���ڰ���: "+msg.length());
		
		String msg="";
		// ���ڿ� ������
//		msg = sc.next();
//		for(int i=msg.length()-1;i>=0;i--) {
//			System.out.print(msg.charAt(i));
//		}
		
		// ���ڿ� ��ĪȮ��
		
		while(true) {    // ���ڿ� ����(¦��)
			msg = sc.next();
			if(msg.length()%2!=0) {
				System.out.println("¦���� ���� �ʿ�");
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
		System.out.println((bCheck?"����":"�ٸ���"));
		
	}
}
