package com.sist.string;

import java.util.Scanner;

public class MainClass7 {
	public static void main(String[] args) {
		
		String[] menu = {
				"�ڹٿ� ����Ŭ",
				"�ڹ����α׷���",
				"ȥ�� ���� �ڹ�",
				"�ڹ� 200��",
				"����Ŭ�� Ajax",
				"Jquery and �ڹ�",
				"HTML5 & CSS3",
				"�ڹٿ� ���̽� ����",
				"������5�� JSON",
				"�ڹ� ����"
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻���: ");
		String find = sc.next();
		
		for(String s:menu) {
			if(s.contains(find)) {
				System.out.println(s);
				try {
					Thread.sleep(300);
				}catch(Exception e) {}
			}
		}
		
	}
}
