package com.sist.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class MainClass {
	public static void main(String[] args) {
		Vector vec = new Vector();
		Collections.addAll(vec,"홍길동","심청","김두한","이순신","강감찬");
		Collections.sort(vec);
		System.out.println(vec.size());
		
		for(int i =0;i<vec.size();i++) {
			String name = (String) vec.get(i);
			System.out.println(name);
		}
		
		ArrayList vec2 = new ArrayList();
		vec2.addAll(vec);
		
	}
}
