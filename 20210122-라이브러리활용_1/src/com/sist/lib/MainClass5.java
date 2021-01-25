package com.sist.lib;
import java.lang.reflect.Method;
/*
 *    Object : 
 *      1. ��ü�� ��ü �� : equals
 *      2. ���ο� �޸� ���� : clone
 *      3. ���ڿ� ��ȯ ��� : toString
 *      4. Ŭ������ ���� �б� : getClass
 *      5. �޸𸮿��� �������� Ȯ�� : finalized
 *      
 *      ============ ��ü �����(5���� ����� ����) 
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
		// class Class -  C�� ��� ������ ������(getClass())
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
