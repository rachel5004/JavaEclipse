package com.sist.movie;

import java.io.FileWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

// daum_movie.txt
// daum_news.txt
/*
 *    String sql="SELECT name,sex,addr FROM member"
 *              +"FROM member";
 *    데이터 읽기 => 파일 저장 
 *    데이터 읽기 => 데이터 전송 => 파일 저장 
 *    
 *    예외처리 => 사전에 에러에 대한 대비 (사용자 실수 , 프로그래머 실수)
 *                                  ========= 
 *     = 예외(에러:수정이 가능한 에러) 복구 
 *       실행 => try , 에러발생 => catch 에러복구 (처음으로 변경 , 점프) : 여러개 사용이 가능
 *     = 예외 회피 : 시스템에서 처리 (컴파일러 통과) : throws
 *     = 예외 전환 : 다른 에러발생 시선을 변경 : throw
 *     
 *     CheckException UnCheckExeption(RuntimeException)
 *       |
 *     IOException : 입출력 
 *                   =====
 *                   1) 메모리 입출력 
 *                   2) 파일 입출력
 *                   3) 네트워크 입출력 (실제 서버, 웹서버)
 *     MalformedURLException : 웹에 연결 
 *     InterrutedException : 쓰레드 (충돌)
 *     ClassNotFoundException 
 *     SQLException 
 */     
/*
			<li>
				<a href="http://v.movie.daum.net/v/20210126150017275" 
				class="thumb_line bg_noimage2" data-tiara-layer="bestpoint" data-tiara-ordnum="1" data-tiara-id="20210126150017275" data-tiara-type="news">
				<span class="thumb_img" style="background-image:url(//img1.daumcdn.net/thumb/S320x200/?fname=https://t1.daumcdn.net/news/202101/26/SBSfunE/20210126150024209dcvw.jpg);"></span>
				</a>
				<span class="cont_line">
					<strong class="tit_line"><a href="http://v.movie.daum.net/v/20210126150017275" class="link_txt" data-tiara-layer="title" data-tiara-ordnum="1" data-tiara-id="20210126150017275" data-tiara-type="news"> 21년전·14년 전에 만들었다고?..박스오피스 점령한 '옛날 영화'</a></strong>
					<a href="http://v.movie.daum.net/v/20210126150017275" class="desc_line" data-tiara-layer="desc_line" data-tiara-ordnum="1" data-tiara-id="20210126150017275" data-tiara-type="news">
						[SBS연예뉴스| 김지혜 기자] 디즈니·픽사의 신작 '소울'이 코로나19로 잔뜩 위축됐던 극장가에 활기를 불어넣고 있는 가운데 박스오피스의 또 다른 성적표가 눈길을 끈다. 박스오피스 3위에 이름을 올린 '화양연화'와 5위에 이름을 올린 '블라인드'가 그 주인공이다. 두 영화는 제작 시기가 10년 이상을 훌쩍 넘긴 '옛날 영화'다. '화양연화'는 2000년
					</a>
					<span class="state_line">
						SBS연예뉴스<span class="txt_dot">・</span><span class="screen_out">발행일자</span>21.01.26
					</span>
				</span>
			</li>
 */

public class MovieManager {
	public static void main(String[] args) {
		MovieManager mm = new MovieManager();
		mm.daumNewsData();
		//static에서 인스턴스메소드 호출시에는 반드시 객체를 생성후에 호출
	}
	public void daumNewsData() {
		try {
			int k=1;
			// 웹서버(다음) 연결, news 데이터 읽기
			for(int i=1;i<=15;i++) {
				Document doc = Jsoup.connect("https://movie.daum.net/magazine/new?tab=nws&regdate=20210126&page="+i).get();
				
				Elements title = doc.select("strong.tit_line a");
				Elements content = doc.select("a.desc_line");
				Elements author = doc.select("span.state_line");
				Elements poster = doc.select("span.thumb_img");
				Elements link = doc.select("a.link_txt");
				
				
				
				for(int j=0;j<title.size();j++) {
					System.out.println("번호: "+k);
					System.out.println("제목:"+title.get(j).text().replace("\"","").replace("\'",""));
					System.out.println("내용:"+content.get(j).text().replace("\"","").replace("\'",""));
					System.out.println("저자:"+author.get(j).text().replace("・", " "));
					String img = poster.get(j).attr("style");
					img = img.substring(img.indexOf("(")+1,img.lastIndexOf(")"));
					System.out.println("http:"+img);
					System.out.println("링크:"+link.get(j).attr("href"));
					System.out.println("==============================");
					
					String msg = String.format("%d^%s^%s^%s^%s\r\n",k,title.get(j).text().replace("\"","").replace("\'","")
								,content.get(j).text().replace("\"","").replace("\'","")
								,author.get(j).text().replace("・", " ")
								,"http:"+img
								,link.get(j).attr("href"));
					FileWriter fw = new FileWriter("c:\\javaDev\\daum_news.txt",true);
					fw.write(msg);
					fw.close();
					k++;
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
