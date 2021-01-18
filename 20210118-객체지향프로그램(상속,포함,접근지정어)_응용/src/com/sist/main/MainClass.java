package com.sist.main;

import com.sist.manager.*;

public class MainClass {

	public static void main(String[] args) {
		MovieManager m = new MovieManager();
		MovieVO[] movie = m.movieAllData();
		System.out.println("MainClass:" + movie);
		
		System.out.println("========== ��ȭ ��� ==========");
		for (MovieVO vo : movie) {
			// System.out.println("����:"+vo.getMno());
			System.out.println("��ȭ��:" + vo.getTitle());
			System.out.println("������:" + vo.getDirector());
			System.out.println("�⿬:" + vo.getActor());
			System.out.println("���:" + vo.getGrade());
			System.out.println("�ٰŸ�:" + vo.getStory());
			System.out.println("===============================================");
		}
	}

}
