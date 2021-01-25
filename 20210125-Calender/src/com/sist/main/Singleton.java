package com.sist.main;
import java.util.*;
class A{      //singleton = 객체를 다르게 쓰지만 메모리는 같은 곳
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
		System.out.println("c="+c);  //같은 주소값
		
	}
}
