package com.sist.anno;

import java.lang.reflect.Method;

public class MovieSystem {
	public static void main(String[] args) {
		MovieSystem ms = new MovieSystem();
		ms.movie("홈");
	}
	public void movie(String menu) {
		try {
			Class clsName = Class.forName("com.sist.anno.MovieManager");  //class 정보를 가지고옴
			//메모리 할당
			Object obj = clsName.getConstructor().newInstance();
			
			//clsName의 모든 메서드 가지고옴
			Method[] methods = clsName.getDeclaredMethods();
			for(Method m: methods) {
				//System.out.println(m.getName());
				RequestMapping rm = m.getAnnotation(RequestMapping.class);
				if(rm.value().equals(menu)) {
					m.invoke(obj, null);
					break;
				}
			}
			
		}catch(Exception ex) {}
	}
}
