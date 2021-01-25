package com.sist.lib;
//equals => ��ü�� ������ �ִ� ���� ��
//== �ּҰ��� ��(�迭,Ŭ����) �Ϲݵ����ʹ� ���� ��
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
		
		if(b1.equals(b2)) {     // override ������� b1.name.equal()�� ����
			System.out.println("b1 b2���� �ּ�");
		}else {
			System.out.println("b1 b2�ٸ� �ּ�");
		}
		if(b1==b3) {
			System.out.println("b1 b3���� �ּ�");
		}else {
			System.out.println("b1 b3�ٸ� �ּ�");
		}
		
	}
}
