package com.sist.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
 * <a href="javascript:melon.play.playSong('19030101',33061995);" title="���ϴ��� ����(2020) ���">���ϴ��� ����(2020)</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									
									<a href="javascript:melon.link.goArtistDetail('994005');" title="�漭 - ������ �̵�">�漭</a><span class="checkEllipsis" style="display: none;"><a href="javascript:melon.link.goArtistDetail('994005');" title="�漭 - ������ �̵�">�漭</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10518234');" title="���ϴ��� ����(2020) - ������ �̵�">���ϴ��� ����(2020)</a>
 */
public class Melon {
	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm").get();
//			//  <span id="aaa"> �ߺ����(X)   => span#aaa			
//			//  <span class="bbb"> �ߺ����   => span.bbb
			
										// �±�  Ÿ��.class��
			Elements title = doc.select("div.ellipsis");
			Elements singer = doc.select("span.checkEllipsis");
			
			for(int i=0;i<title.size();i++) {
				System.out.println(title.get(i).text());
				System.out.println(singer.get(i).text());
				System.out.println("=============================");
			}
		}catch(Exception e){}
	}
}
