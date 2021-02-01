package com.sist.map;
import java.util.*;
public class map {
	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put("id", "admin");
		map.put("pwd", "1234");
		map.put("name", "홍길동");
		map.put("sex", "male");
		
		System.out.println("ID: "+map.get("id"));
		System.out.println("PWD: "+map.get("pwd"));
		System.out.println("NAME: "+map.get("name"));
		System.out.println("SEX: "+map.get("sex"));
	}
}
