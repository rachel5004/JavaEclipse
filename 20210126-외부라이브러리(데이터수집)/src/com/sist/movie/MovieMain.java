package com.sist.movie;
import java.io.*;
import java.util.*;
/*
 *  객체지향프로그램 (유지보수)
 *  = 데이터 보호 :  데이터는 감추고(은닉화: private) 메소드(public)로 데이터 접근 -> 캡슐화
 *  = 재사용
 *   1) 상속 (오버로딩, 오버라이딩) = extends = is-a
 *   	-> 상위클래스의 메모리를 할당 후 하위 클래스에 전송하기 때문에 속도가 느림
 *   	-> 재정의(오버라이딩) : 오버라이딩 대상의 메소드 내용을 다 알고있어야함
 *   	->
 *   2) 포함 (변경 x) = has-a
 *  = 수정, 추가 용이
 *    
 * 
 */
class NewsVO {
	// 멤버변수는 자동 초기화
	private int no; // 0 
	private String title, content, poster, author, link; // null
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
}
class MovieSystem{ // data관리
	// user가 데이터를 공유 -> 자바(static), 파일, 오라클
	private static NewsVO[] news = new NewsVO[300];
	static {
		try {
			FileReader fr = new FileReader("c:\\javaDev\\daum_news.txt");
			StringBuffer sb = new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1) {
				sb.append(String.valueOf((char)i));
			}
			fr.close();
			System.out.println(sb);
			String[] data = sb.toString().split("\n");
			for(String s:data) {
				StringTokenizer st = new StringTokenizer(s,"^");
				news[i] = new NewsVO();
				news[i].setNo(Integer.parseInt(st.nextToken()));
				news[i].setTitle(st.nextToken());
				news[i].setContent(st.nextToken());
				news[i].setAuthor(st.nextToken());
				news[i].setPoster(st.nextToken());
				news[i].setLink(st.nextToken());
				i++;
			}
		}catch(Exception e) {}
	}
	public NewsVO[] newsAllData() {
		return news;
	}
}
public class MovieMain {
	public static void main(String[] args) {
		MovieSystem ms = new MovieSystem();
		NewsVO[] news = ms.newsAllData();
		for(NewsVO vo:news) {
			System.out.println(vo.getTitle());
		}
	
	}
}
