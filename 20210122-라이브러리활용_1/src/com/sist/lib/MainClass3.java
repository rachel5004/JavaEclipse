package com.sist.lib;
/*
 *   toString() : 객체를 문자열 변환
 *                (String) => 형변환
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
        System.out.println("a="+a);// toString() 자동호출
        System.out.println("a="+a.toString());
        
        System.out.println("b="+b);
        System.out.println("b="+b.toString());
	}

}

















