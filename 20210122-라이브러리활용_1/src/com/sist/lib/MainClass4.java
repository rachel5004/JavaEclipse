package com.sist.lib;
//equals => 객체가 가지고 있는 값만 비교
//== 주소값을 비교(배열,클래스) 일반데이터는 값을 비교
/*
*     int a=(int)(Math.random()*100)+1 => 1~100
*                double 
*                int
*/
class B{
	String name, addr;
	public B(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof B)
			return name.equals(((B)obj).name);
		else return false;
	}
	
}
public class MainClass4 {
	public static void main(String[] args) {
		B b1 = new B("name");
		B b2 = new B("name");
		B b3 = b1;
		
		if(b1.equals(b2)) {     // override 없을경우 b1.name.equal()로 가능
			System.out.println("b1 b2같은 주소");
		}else {
			System.out.println("b1 b2다른 주소");
		}
		if(b1==b3) {
			System.out.println("b1 b3같은 주소");
		}else {
			System.out.println("b1 b3다른 주소");
		}
		
	}
}
