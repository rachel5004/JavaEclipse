package com.sist.string;

public class MainClass8 {
	public static void main(String[] args) {
		String msg = "          Hello Java ";
		System.out.println(msg);
		System.out.println(msg.length());
		
		String msg2 =msg.trim();
		System.out.println(msg2);
		System.out.println(msg2.length());
		
		
		int a=100;
		int b=200;
		String s1=String.valueOf(a);
		String s2=String.valueOf(b);
		String s3=String.valueOf(true);
		String s4=String.valueOf(10.5);

	}
}
