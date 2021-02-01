package com.sist.server;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.*; //파일에 저장
/*
 *    자바에서 제공하는 IO(Input,Output)
 *    Input : 파일, 메모리,네트워크에서 데이터 읽기
 *    Output : 파일 , 메모리 , 네트워크 데이터 전송 
 *                   =====
 *                   System.out
 *                   System.in
 *    =======================================
 *    InputStream , OutputStream => 바이트 스트림(1byte씩 읽어 온다) => Upload,Download
 *    Reader , Writer => 문자 스트림 (2byte씩 읽어온다)
 *      *** 한글 (한글자당 => 2byte)
 */
public class MovieHtmlParser {
	// cno: 상영-> 개봉-> 주간-> 월간-> 연간
	public void MovieAllData() {
		
		StringBuffer sb = new StringBuffer();
		
		try {
			//<div class="wrap_desc">
			//<a href="/moviedb/main?movieId=135111
			
//			int mno = 1; //영화 고유번호
//			int cno = 1;
			//"https://movie.daum.net/premovie/released?"
			//							+ "reservationOnly=N&sort=reservation&page="
//			int mno = 40;
//			int cno=2;
			//"https://movie.daum.net/premovie/scheduled?reservationOnly=N&sort=reservation&page="+i
			int mno = 168;
			int cno=5;
			
			//for(int i=1;i<=7;i++) {
				Document doc = Jsoup.connect("https://movie.daum.net/boxoffice/yearly").get();
				Elements link = doc.select("div.wrap_desc a.desc_movie");
				
				
			for(int j=0;j<link.size();j++) {
				try {
					
					System.out.println(link.get(j).attr("href"));
					Document doc2 = Jsoup.connect("http://movie.daum.net"+link.get(j).attr("href")).get();
					
					
					Element title = doc2.selectFirst("span.txt_name");
					//System.out.println(title.text());
					
					Element score = doc2.selectFirst("div.info_origin a");
					String s = score.text();
					String scores = s.substring(s.indexOf("점")+3).replace(" ", "");
					
					//System.out.println(scores);
					
					Element genre = doc2.selectFirst("dd.txt_main");
					//System.out.println(genre.text());
					
					Element etc = doc2.select("dl.list_movie").get(1);
					s =etc.text();
					s=s.substring(s.indexOf("라")+2);
					String regdate = s.substring(0,s.indexOf(",")-5).replaceAll("[가-힣]","").replace("(", "").replace(")","");
					//System.out.println(regdate.replaceAll("[가-힣]","").replace("(", "").replace(")",""));
					
					
					String time = s.substring(0,s.indexOf(","));
					time = time.substring(time.lastIndexOf(" ")+1);
					//System.out.println(time);
					
					String grade = s.substring(s.indexOf(",")+2);
					//System.out.println(grade);
					
					Element director = doc2.select("a.link_person").get(0);
					Element actor = doc2.select("a.link_person").get(1);
					//System.out.println(director.text());
					//System.out.println(actor.text());
					
					Element story = doc2.selectFirst("div.desc_movie p");
					//System.out.println(story.text());
					
					Element poster = doc2.selectFirst("span.thumb_img img");
					//System.out.println(poster.attr("src"));
					
					Element showUser = doc2.selectFirst("em.emph_g");
					//System.out.println(showUser.text());
	
					String msg = mno+"|"+cno+"|"
							+title.text()+"|"+scores+"|"+genre.text()
							+"|"+regdate+"|"+time+"|"+grade+"|"+director.text()
							+"|"+actor.text()+"|"+poster.attr("src")
							+"|"+showUser.text()+"|"+story.text()+"\r\n";
					
					
					sb.append(msg);
					mno++;
					
					/*
					 *    <div class="aaa">
					 *    	<a href="http://~">link</a>
					 *    </div> 
					 *    
					 * => text() : link / attr("href") : "http://~"
					 */
					}catch(Exception e) {}
					
				}
			//}
			FileWriter fw = new FileWriter("c:\\javaDev\\daum-movie.txt",true);
			fw.write(sb.toString());
			fw.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		MovieHtmlParser m = new MovieHtmlParser();
		m.MovieAllData();
	}
}
