package com.sist.lib;
import java.util.*;
import java.text.*;  // ChoiceFormat


public class MainClass2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[10];
		Random r = new Random();
		for(int i=0;i<score.length;i++) {
			score[i] = r.nextInt(50)+51;  // 0~49 +51
		}
		char[] grade = new char[10];
		for(int i=0;i<score.length;i++) {
			switch(score[i]/10) {
			case 10:
			case 9: 
				grade[i]='A';
				break;
			case 8: 
				grade[i]='B';
				break;
			case 7: 
				grade[i]='C';
				break;
			case 6: 
				grade[i]='D';
				break;
			default: grade[i] = 'F';
				
			}
		}
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]+":"+grade[i]);
		}
//		for (int i:score) {
//			System.out.print(i+" ");
//		}
	}
}
