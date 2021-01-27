package com.sist.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
 * <td class="link"><a href="#" class="btn-basic btn-info" onclick="fnViewSongInfo('92070716');return false;">곡 제목 정보 페이지</a></td>
                                <td class="info">
                                    
                                    
                                    <a href="#" class="title ellipsis" title="재생" onclick="fnPlaySong('92070716','1');return false;">
                                        
                                                이 밤을 빌려 말해요 (바른연애 길잡이 X 10CM)</a>

                                        <a href="#" class="artist ellipsis" onclick="fnViewArtist('80044692');return false;">10CM</a>
                                        
                                        <div class="toggle-button-box">
                                        albumtitle ellipsis
 */
public class Jenie {
	public static void main(String[] args) {
		try {
			for (int j=1;j<5;j++) {
				Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20210126&hh=12&rtm=Y&pg="+j).get();
	//			System.out.println(doc);
				
											// 태그  타입.class명
				Elements title = doc.select("a.title");
				Elements artist = doc.select("a.artist");
				Elements album = doc.select("a.albumtitle");
			
			
				for(int i=0;i<title.size();i++) {
					System.out.println(title.get(i).text());
					System.out.println(artist.get(i).text());
					System.out.println(album.get(i).text());
					System.out.println("=============================");
				}
			}
		}catch(Exception e){}
	}

}
