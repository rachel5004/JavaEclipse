package com.sist.lib;
/*
 *   toString() : ��ü�� ���ڿ� ��ȯ
 *                (String) => ����ȯ
 */
// new A(); ==> a
class A {
	int a=100;

	@Override
	public String toString() {
		return ":Hello~~";
	}
	
}
public class MainClass3 {

	public static void main(String[] args) {
        A a=new A();
        A b=new A();
        System.out.println("a="+a);// toString() �ڵ�ȣ��
        System.out.println("a="+a.toString());
        
        System.out.println("b="+b);
        System.out.println("b="+b.toString());
	}

}

















