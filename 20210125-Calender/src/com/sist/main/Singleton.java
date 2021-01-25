package com.sist.main;
import java.util.*;
class A{      //singleton = ��ü�� �ٸ��� ������ �޸𸮴� ���� ��
	private static A a = null;
	public static A getInstance() {
		if (a==null)
			a=new A();
		return a;
	}
}
public class Singleton {
	public static void main(String[] args) {
		A a = A.getInstance();
		System.out.println("a="+a);
		A b = A.getInstance();
		System.out.println("b="+b);    
		A c = A.getInstance();
		System.out.println("c="+c);  //���� �ּҰ�
		
	}
}
