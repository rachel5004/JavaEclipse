package com.sist.main;
import java.util.*;
class Diary{
	public void myDate() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("year: ");
		int year = sc.nextInt();
		System.out.print("month: ");
		int month = sc.nextInt();
		System.out.print("day: ");
		int day = sc.nextInt();
		
		int total = (year-1)*365 
					+(year-1)/4
					-(year-1)/100
					+(year-1)/400;
		int[] lastday = {31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%4==0 && year%100!=0)||(year%400==0))
			lastday[1]=29;
		else lastday[1]=28;
		for(int i = 0;i<month-1;i++) {
			total+=lastday[i];
		}
		total+=day;
		int week = total%7;
		String[] strweek = {"일","월","화","수","목","금","토"};
		System.out.printf("%d년 %d월 %d일은 %s요일입니다\n",year,month,day,strweek[week]);
		
	}
}
public class MainClass {
	public static void main(String[] args) {
		Diary d = new Diary();
		d.myDate();
	}
}
