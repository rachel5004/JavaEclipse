package com.sist.map;
import java.util.*;
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
