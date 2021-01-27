package com.sist.lib;
import java.text.*;
import java.util.Random;
public class MainClass3 {
	public static void main(String[] args) {
		double[] limits= {50,60,70,80,90};
		String[] grades = {"F","D","C","B","A"};
		
		int[] score = new int[10];
		Random r = new Random();
		for(int i=0;i<score.length;i++) {
			score[i] = r.nextInt(50)+51;  // 0~49 +51
		}
		
		
		// mainclass2 - switch case�� 
		
		ChoiceFormat format = new ChoiceFormat(limits,grades);
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]+":"+format.format(score[i]));
		}
		
	}
}
