package com.sist.server;
import java.util.*;


import java.io.*;

public class MovieManager {
	private static ArrayList<MovieVO> list = new ArrayList<MovieVO>();
	static {
		try {
			FileReader fr = new FileReader("c:\\javaDev\\daum_movie.txt");
			StringBuffer sb = new StringBuffer();
			
			int i=0;
			while((i=fr.read())!=-1) {
				sb.append(String.valueOf((char)i));
			}
			fr.close();
			//System.out.println(sb.toString());
			String[] movie_data = sb.toString().split("\n");
			for(String s:movie_data) {
				//System.out.println(s);
				StringTokenizer st = new StringTokenizer(s,"|");
				MovieVO vo = new MovieVO();
				vo.setNo(Integer.parseInt(st.nextToken()));
				vo.setCno(Integer.parseInt(st.nextToken()));
				vo.setTitle(st.nextToken());
				vo.setScore(st.nextToken());
				vo.setGenre(st.nextToken());
				vo.setRegdate(st.nextToken());
				vo.setTime(st.nextToken());
				vo.setGrade(st.nextToken());
				vo.setDirector(st.nextToken());
				vo.setActor(st.nextToken());
				vo.setPoster("http:"+st.nextToken());
				vo.setShowUser(st.nextToken());
				vo.setStory(st.nextToken());
				
				list.add(vo);
				
			}
		}catch(Exception e) {}	
	}
	
	//목록 전체 출력
	public ArrayList<MovieVO> movieListData(int page){
		ArrayList<MovieVO> mList = new ArrayList<MovieVO>();
		int j=10;
		int pagecnt=(page*10)-10;
		int totalpage = movieListTotalPage();
		if(page==totalpage) {
			if(list.size()%10>0) {
				j=list.size()%10;
			}
		}
		for (int i=pagecnt;i<pagecnt+10;i++) {
			MovieVO vo = list.get(i);
			mList.add(vo);
		}
		return mList;
	}
	
	//카테고리별 출력
	public ArrayList<MovieVO> movieCategoryData(int page,int cno){
		ArrayList<MovieVO> mList = new ArrayList<MovieVO>();
		return mList;
	}
	
	//상세 보기
	public MovieVO movieDetailData(int no) {
		MovieVO vo = list.get(no-1);
		return vo;
	}
	//찾기
	public ArrayList<MovieVO> movieFindData(String title){
		ArrayList<MovieVO> mList = new ArrayList<MovieVO>();
		for(MovieVO vo:list) {
			if(vo.getTitle().contains(title)) {
				mList.add(vo);
			}
		}
		return mList;
	}
	//총페이지
	public int movieListTotalPage() {
		int total=(int)(Math.ceil(list.size()/10.0));
		return total;
	}
	public int movieCategoryTotalPage(int cno) {
		int total=0;
		int cnt = 0;
		for(MovieVO vo:list) {
			if(vo.getCno()==cno) {
				cnt++;
			}
		}
		total=(int)(Math.ceil(cnt/10.0));
		return total;
	}
	public static void main(String[] args) {
		MovieManager m = new MovieManager();
		String[] category = {"","현재상영","개봉예정","박스오피스(주간)","박스오피스(월간)","박스오피스(연간)"};
		
		/*System.out.println("총페이지: "+m.movieListTotalPage());
		for(int i=1;i<=5;i++) {
			System.out.println(category[i]+":"+m.movieCategoryTotalPage(i));
		}
		*/
		/*for(MovieVO vo:list) {
			System.out.println(vo.getNo()+"|"+vo.getTitle());
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("검색어 입력: ");
		String find_data = sc.next();
		ArrayList<MovieVO> list = m.movieFindData(find_data);
		System.out.println("검색 결과: "+list.size());
		for(MovieVO vo:list) {
			System.out.println(vo.getNo()+":"+vo.getTitle());
		}
		*/
		/*System.out.print("상세 영화번호 입력(1~219): ");
		int no = sc.nextInt();
		MovieVO vo = m.movieDetailData(no);
		System.out.println("번호: "+vo.getNo());
		System.out.println("제목: "+vo.getTitle());
		System.out.println("감독: "+vo.getDirector());
		System.out.println("출연: "+vo.getActor());
		System.out.println("장르: "+vo.getGenre());
		System.out.println("장르: "+vo.getGrade());
		System.out.println("평점: "+vo.getScore());
		System.out.println("시간: "+vo.getTime());
		System.out.println("줄거리: "+vo.getStory());
		*/
		System.out.print("페이지 입력: ");
		int page = sc.nextInt();
		ArrayList<MovieVO> vo = m.movieListData(page);
		for(MovieVO mv:vo) {
			System.out.println(mv.getTitle());
		}

		
	}
	
}
