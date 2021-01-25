package com.sist.string;
// concat(),+
import java.util.*;
public class MainClass3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("성 입력: ");
		String fst = sc.next();
		System.out.print("이름 입력: ");
		String snd = sc.next();
		
		String name = fst.concat(snd);
		System.out.println("name: "+name);
		System.out.println("name: "+fst+snd);
	}
}
