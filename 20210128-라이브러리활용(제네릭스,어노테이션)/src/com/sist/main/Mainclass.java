package com.sist.main;
/*
 *    제네릭스 : 데이터형을 통일해서 사용 
 *    형식) <className> => 자바에서 제공하는 컬렉션의 모든 데이터형 => Object
 *         => Object를 다른 데이터형으로 변환 
 *         장점 :
 *               1. 데이터형의 안정성 
 *               2. 형변환이 없고 소스가 간결하다 
 *         예) ArrayList<String>
 *            ArrayList<int>(X) => ArrayList<Integer>
 *            ArrayList<MovieVO>
 */


class Box<T>{
	T item;
	public void setItem(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return item;
	}
}
public class Mainclass {
	public static void main(String[] args) {
		Box box = new Box();
		String box_1 = (String) box.getItem();
		
		Box<String> box1 = new Box<String>();
		String s = box1.getItem();   //string 제네릭스라 형변환 없이 사용가능
		
	}
}
