package com.sist.string;

public class MainClass9 {
	public static void main(String[] args) throws Exception {
		//byte[] s = "æ»≥Á«œººø‰".getBytes();
		//String str = new String(s,"UTF-8");
		//System.out.println(str);
		
		String color="red,blue,green";
		String[] colors=color.split(",");
		String str = String.join("-", colors);
		System.out.println(str);
		
		String s = String.format("%d * %d = %d", 10,20,10+20);
		System.out.println(s);
	}
}
