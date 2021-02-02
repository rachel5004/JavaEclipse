package com.sist.map;
import java.util.*;
public class MainClass2 {
	public static void main(String[] args) {
		Vector vec = new Vector();
		vec.add("액션");
		vec.add("멜로");
		vec.add("드라마");
		vec.add("코미디");
		vec.add("판타지");
		vec.add("판타지");
		vec.add("판타지");		
		vec.add("SF");
		
		HashSet set = new HashSet();  //무작위(idx없음),중복제거
		for(int i=0;i<vec.size();i++) {
			
		String genre = (String)vec.get(i);
		set.add(genre);
		
		}
		System.out.println(set);
		
//		
//		for(int i=0;i<vec.size();i++) {
//			String genre = (String)vec.elementAt(i);
//			System.out.println(genre);
//		}
//		
//		System.out.println("=======데이터 수정=======");
//		vec.setElementAt("공포",9);
//		for(int i=0;i<vec.size();i++) {
//			String genre = (String)vec.elementAt(i);
//			System.out.println(genre);
//		}
	}
}
