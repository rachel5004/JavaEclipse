// ĸ��ȭ �ڵ� 
/*
 *   �������
 *    �ʱ�ȭ 
 *    ===================
 *     1. ������
 *     2. �ʱ�ȭ�� 
 *    =================== ������ �Ұ��� (�ѹ��� ȣ�� �ϱ� ������)
 *     3. getter/setter
 *     
 *    class A
 *    {
 *       private int a,b,c;
 *       public A(int a,int b,int c)
 *       {
 *           this.a=a;
 *           this.b=b;
 *           this.c=c;
 *       }
 *    }
 *    
 *    A aa=new A(10,20,30);
 *    aa=new A(20,30,40);
 *    aa=new A(30,40,50);
 */


package com.sist.manager;

public class MusicVO {
	private int rank;
	private String title, singer, poster, movie;
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}

}
