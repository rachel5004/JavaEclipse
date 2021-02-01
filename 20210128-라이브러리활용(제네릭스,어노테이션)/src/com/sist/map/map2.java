package com.sist.map;
import java.util.*;
public class map2 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("movieAllData","SELECT * FROM movie");
		map.put("movieDetailData","SELECT * FROM movie WHERE mno=1");
		map.put("movieDelete","DELETE * FROM movie WHERE mno=1");
	
	
	
		System.out.println(map.get("movieAllData"));
		System.out.println(map.get("movieDelete"));
	}
}
