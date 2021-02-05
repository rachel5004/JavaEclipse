package com.sist.movie;
// 파일에 ArrayList 저장
import java.io.*;
import java.util.*;
public class ObjectSaveClass {
	/*
	 * private int mno, cno;
	   private String title, score, genre,
	    regdate, time, grade, director, actor,showUser, story;
	
	 */
	public static void main(String[] args) throws IOException{
		
		// read file
		FileInputStream fis = new FileInputStream("c:\\javaDev\\daum_movie.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		
		// save file in memory
		ArrayList<MovieVO> list = new ArrayList<MovieVO>();
		while(true) {
			String movie_data = br.readLine();
			if(movie_data==null) break;
			StringTokenizer st = new StringTokenizer(movie_data,"|");
			MovieVO vo = new MovieVO();
			vo.setMno(Integer.parseInt(st.nextToken()));
			vo.setCno(Integer.parseInt(st.nextToken()));
			vo.setTitle(st.nextToken());
			vo.setScore(st.nextToken());
			vo.setGenre(st.nextToken());
			vo.setRegdate(st.nextToken());
			vo.setTime(st.nextToken());
			vo.setGrade(st.nextToken());
			vo.setDirector(st.nextToken());
			vo.setActor(st.nextToken());
			vo.setShowUser(st.nextToken());
			vo.setStory(st.nextToken());
			list.add(vo);
		}
		fis.close();
		FileOutputStream fos = new FileOutputStream("c:\\download\\movie.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		
		System.out.println("save complete");
		
	}
}
