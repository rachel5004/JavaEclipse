package com.sist.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
 * 1.<h3> 팔레드 신</h3>
                          </a>
                        </span>
                        <strong class="point  ">
                          <span>4.7</span>
                        </strong>
                        <p class="etc ">서울특별시 중구 퇴계로 67 6F</p>
 */
public class Mango {
	public static void main(String[] args) {
		try {
//			Document doc = Jsoup.connect("https://www.mangoplate.com/top_lists/1420_hotel_restaurant").get();
			Document doc = Jsoup.connect("https://www.10000recipe.com/chef/chef_list.html").get();

//			Elements name = doc.select("h3");
//			Elements loc = doc.select("p.etc");
			Elements name = doc.select("a.info_name_f");
			Elements cook = doc.select("span.mem_cont1");
			Elements scrap = doc.select("span.mem_cont2");
			Elements hit = doc.select("span.mem_cont3");
			Elements follow = doc.select("span.mem_cont4");
			
			for(int i=0;i<name.size();i++) {
//				System.out.println(name.get(i).text());
//				System.out.println(loc.get(i).text());
				System.out.println(name.get(i).text());
				System.out.println(cook.get(i).text());
				System.out.println(scrap.get(i).text());
				System.out.println(hit.get(i).text());
				System.out.println(follow.get(i).text());
				
				System.out.println("=============================");
			}
		}catch(Exception e){}
	}

}
