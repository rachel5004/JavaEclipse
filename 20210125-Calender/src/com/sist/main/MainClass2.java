package com.sist.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance();
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("year: ");
//		int year = sc.nextInt();
//		System.out.print("month: ");
//		int month = sc.nextInt();
//		System.out.print("day: ");
//		int day = sc.nextInt();
//		
//		cal.set(Calendar.YEAR, year);
//		cal.set(Calendar.MONTH, month-1);
//		cal.set(Calendar.DATE, day);
//		
//		int lastday = cal.getActualMaximum(Calendar.DATE);   //�� ���� ������ ��¥
//		System.out.println(lastday);
//		
//		int week = cal.get(Calendar.DAY_OF_WEEK)-1;
//		String[] strweek = {"��","��","ȭ","��","��","��","��"};
//		
//		String msg = String.format("%d�� %d�� %d���� %s�����Դϴ�\n", cal.get(Calendar.YEAR),
//							cal.get(Calendar.MONTH)+1,cal.get(Calendar.DATE),strweek[week]);
//		
//		System.out.println(msg);
		
		
		Date date = new Date();     //�ý��� �ð� -> Oracle ����ÿ� ���
		System.out.println(date);
		SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
	
	}

}
