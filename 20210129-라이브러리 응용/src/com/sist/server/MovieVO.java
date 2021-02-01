package com.sist.server;
/*
 * 소울(2020)
평점 08 . 6
애니메이션/판타지
2021.01.20 개봉
 107분, 전체관람가
감독 피트 닥터, 켐프 파워스 주연 제이미 폭스, 티나 페이
누적관객598,051명 
나는 어떻게 ‘나’로 태어나게 되었을까? 
지구에 오기 전 영혼들이 머무는 ‘태어나기 전 세상’이 있다면?  
 */

/* 클래스 1. 데이터만 모아서 저장할 목적 : 데이터형 클래스
			~VO(ValueObject), DTO(Data Transfer Object)
		2. 데이터 활용(메소드) : 액션 클래스
			~Manager(File, Memory), ~DAO(Data access obj, 데이터베이스 연결)
			
*/
public class MovieVO {
	private int no,cno;    //고유번호, 카테고리번호(상영,개봉,주간,월간,연간)
	private String title;
	private String score;  // Double.parseDouble
	private String genre, regdate, time, grade, director, actor,showUser, story, poster;
	private String key; // 동영상
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getShowUser() {
		return showUser;
	}
	public void setShowUser(String showUser) {
		this.showUser = showUser;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	
}
