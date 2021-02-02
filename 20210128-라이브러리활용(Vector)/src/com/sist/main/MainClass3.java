package com.sist.map;
import java.util.*;
/*
 *   LinkedList : 순서가 있다 , 데이터 중복이 가능 
 *   ==========
 *    =====
 *     다음 
 *     연결 
 *     주소
 *    =====   => 
 *     실제 
 *     데이터
 *    =====
 *    
 *    => List로부터 상속 
 *       public class LinkedList implements List
 *    => class(단일) , interface(class)(다중)
 *                    class를 확장 => 상위클래스
 *                    
 *    추가: add()
 *    읽기: get()
 *    삭제: remove()
 *    수정: set()
 *    갯수 : size()   
 */
public class MainClass3 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("apple");
		list.add("pear");
		list.add("grape");
		list.add("orange");
		list.add("melon");
		list.add("berry");
		
		for(int i=0;i<list.size();i++) {
			String s = (String)list.get(i);
			System.out.println(s);
			}
		
		System.out.println("========수정========");
		list.set(3, "귤");
		for(int i=0;i<list.size();i++) {
			String s = (String)list.get(i);
			System.out.println(s);
		}
		System.out.println("========삭제========");
		list.remove(5);
		for(int i=0;i<list.size();i++) {
			String s = (String)list.get(i);
			System.out.println(s);
		}
		
		System.out.println("========전체 삭제========");
		list.clear();
		System.out.println(list.size());
	}
}
