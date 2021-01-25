package com.sist.lib;
import java.lang.reflect.Method;
/*
 *    Object : 
 *      1. 객체와 객체 비교 : equals
 *      2. 새로운 메모리 생성 : clone
 *      3. 문자열 변환 기능 : toString
 *      4. 클래스의 정보 읽기 : getClass
 *      5. 메모리에서 해제여부 확인 : finalized
 *      
 *      ============ 객체 만든다(5가지 기능이 포함) 
 *      
 *      String => final 
 *      
 */

class C{
	public void display() {
		System.out.println("C:display() call...");
	}
}
public class MainClass5 {
	public static void main(String[] args) {
		C c = new C();
		Class cc = c.getClass();  
		// class Class -  C의 모든 정보를 가져옴(getClass())
		Class cc1= C.class; 
//		Class cc2= C.forName("");
		
		c.display();
		try {
			Class clsname = Class.forName("com.sist.lib.C");
			Object obj = clsname.newInstance();
			Method[] m = clsname.getDeclaredMethods();
			m[0].invoke(obj,null);
		}catch(Exception e) {}
		
	}
}
