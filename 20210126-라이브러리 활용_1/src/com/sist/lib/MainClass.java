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
		
		//�ý��� ��¥
		Date date = new Date();
		
		//��¥ ��ȯ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String today = sdf.format(date);
		
		System.out.println(today);
		//string���� �и�
		StringTokenizer st = new StringTokenizer(today,"-");
		String stryear = st.nextToken();
		String strmonth = st.nextToken();
		String strday = st.nextToken();
		
		System.out.println("year: "+stryear);
		System.out.println("month: "+strmonth);
		System.out.println("day: "+strday);
		
		//������ ��ȯ
		int year = Integer.parseInt(stryear);
		int month = Integer.parseInt(strmonth);
		int day = Integer.parseInt(strday);
		
		System.out.println("int year: "+year);
		System.out.println("int month: "+month);
		System.out.println("int day: "+day);
		
		//��ü�� ���������ʰ� �����ڸ� ����ϸ� �޸𸮰� �پ���
		String today2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
		System.out.println(today2);
		
		
		A a= new A();
		a.display();
		
		new A().display();
	}
	
}
