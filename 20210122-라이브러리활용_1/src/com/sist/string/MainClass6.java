package com.sist.string;

public class MainClass6 {
	public static void main(String[] args) {
		String color = "red?blue?green?black?yellow?magenta";
		String[] colors = color.split("\\?");  //?는 정규식이기때문에 이스케이프해줘야함
		for(String s:colors) System.out.println(s);
	}
}
