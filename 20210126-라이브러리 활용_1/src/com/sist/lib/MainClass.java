package com.sist.lib;
import java.util.*;
import java.text.*;

class A{
	public void display() {
		System.out.println("A:display() call...");
	}
}
public class MainClass {
	public static void main(String[] args) {
		//System.out.println(new Date());
		
		//시스템 날짜
		Date date = new Date();
		
		//날짜 변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String today = sdf.format(date);
		
		System.out.println(today);
		//string으로 분리
		StringTokenizer st = new StringTokenizer(today,"-");
		String stryear = st.nextToken();
		String strmonth = st.nextToken();
		String strday = st.nextToken();
		
		System.out.println("year: "+stryear);
		System.out.println("month: "+strmonth);
		System.out.println("day: "+strday);
		
		//정수형 변환
		int year = Integer.parseInt(stryear);
		int month = Integer.parseInt(strmonth);
		int day = Integer.parseInt(strday);
		
		System.out.println("int year: "+year);
		System.out.println("int month: "+month);
		System.out.println("int day: "+day);
		
		//객체를 생성하지않고 생성자를 사용하면 메모리가 줄어든다
		String today2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
		System.out.println(today2);
		
		
		A a= new A();
		a.display();
		
		new A().display();
	}
	
}
