package com.sist.lib;
/*
 *    예)
 *         String => String substring(int start)
 *         String s="Hello";
 *         s.substring(4)
 *    java.lang : import를 생략할 수 있다 
 *    ==========
 *     = Object 
 *       ========  모든 클래스의 상위클래스(최상의 클래스)
 *         기능(메소드) : 오버라이딩 => 매개변수 , 리턴형 , 메소드명 
 *           = toString() : 객체를 문자열로 변환 => (String) , .toString()
 *           = finalized() : 소멸자 (객체가 메모리에서 해제=> 자동 호출)
 *           = clone() : 복제 (새로운 메모리 제작)
 *             = 얕은 복사
 *               A a=new A();
 *               A b=a;
 *             = 깊은 복사
 *               A a=new A();
 *               A b=a.clone(); 
 *           =
 *     = String
 *     = StringBuffer/StringBuilder
 *     = Math
 *     = Wrapper
 *       모든 데이터형을 클래스 => 데이터를 쉽게 제어할 수 있게 만든 클래스
 *           => 모든 데이터형 = 문자열 변환 
 *           => 문자열 = 각데이터형으로 변경 
 *              int a=(int)"10";(X)  ==> Web,Window => String => char[]
 *              int a= {'1','0'} 주소
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
		Object obj = null; //지역변수는 반드시 초기값 설정
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
			
			Box box3 =  (Box)box1.clone();  //object가 상위 클래스기때문에 형변환
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
