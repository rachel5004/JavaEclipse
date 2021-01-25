package com.sist.lib;
/*
 *    ��)
 *         String => String substring(int start)
 *         String s="Hello";
 *         s.substring(4)
 *    java.lang : import�� ������ �� �ִ� 
 *    ==========
 *     = Object 
 *       ========  ��� Ŭ������ ����Ŭ����(�ֻ��� Ŭ����)
 *         ���(�޼ҵ�) : �������̵� => �Ű����� , ������ , �޼ҵ�� 
 *           = toString() : ��ü�� ���ڿ��� ��ȯ => (String) , .toString()
 *           = finalized() : �Ҹ��� (��ü�� �޸𸮿��� ����=> �ڵ� ȣ��)
 *           = clone() : ���� (���ο� �޸� ����)
 *             = ���� ����
 *               A a=new A();
 *               A b=a;
 *             = ���� ����
 *               A a=new A();
 *               A b=a.clone(); 
 *           =
 *     = String
 *     = StringBuffer/StringBuilder
 *     = Math
 *     = Wrapper
 *       ��� ���������� Ŭ���� => �����͸� ���� ������ �� �ְ� ���� Ŭ����
 *           => ��� �������� = ���ڿ� ��ȯ 
 *           => ���ڿ� = �������������� ���� 
 *              int a=(int)"10";(X)  ==> Web,Window => String => char[]
 *              int a= {'1','0'} �ּ�
 *       Byte = byte
 *       Short = short
 *       ***Long  = long
 *       ***Integer = int
 *       ***Double = double
 *       Float = float
 *       ***Boolean = boolean 
 *     = System
 */
class Box implements Cloneable{
	private int width, height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

//	@Override
//	protected Object clone() {
//		Object obj = null;
//		try {
//			obj = super.clone();
//		}catch(Exception e) {}
//		return obj;
//	}
	public Box clone() {
		Object obj = null; //���������� �ݵ�� �ʱⰪ ����
		try {
			obj = super.clone();
		}catch(Exception e) {}
		return (Box)obj;
	}
	
}
public class MainClass {

	public static void main(String[] args) {

			Box box1 = new Box();
			box1.setWidth(100);
			box1.setHeight(100);
			
			Box box2 =  box1;
			box2.setWidth(300);
			box2.setHeight(300);
			
			System.out.println("box1 width: "+ box1.getWidth());
			System.out.println("box1 height: "+ box1.getHeight());
			
			System.out.println("================");
			
			Box box3 =  (Box)box1.clone();  //object�� ���� Ŭ�����⶧���� ����ȯ
			System.out.println("box3 width: "+ box3.getWidth());
			System.out.println("box3 height: "+ box3.getHeight());
			
			box3.setWidth(500);
			box3.setHeight(500);
			
			System.out.println("box1 width: "+ box1.getWidth());
			System.out.println("box1 height: "+ box1.getHeight());
			
			System.out.println("==================");
			System.out.println("box1: "+box1);
			System.out.println("box2: "+box2);
			System.out.println("box3: "+box3);
	}

}
