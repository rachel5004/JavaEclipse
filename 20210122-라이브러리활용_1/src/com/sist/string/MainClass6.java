package com.sist.string;

public class MainClass6 {
	public static void main(String[] args) {
		String color = "red?blue?green?black?yellow?magenta";
		String[] colors = color.split("\\?");  //?�� ���Խ��̱⶧���� �̽��������������
		for(String s:colors) System.out.println(s);
	}
}
