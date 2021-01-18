package com.sist.manager;
import java.io.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class MusicManager {
	public MusicVO[] MusicAllData() {
		MusicVO[] music = new MusicVO[50];
		try {
			FileReader fr = new FileReader("c:\\javaDev\\genie.json");
			String data = "";
			int i = 0;
			while((i=fr.read())!=-1) {
				data += String.valueOf((char)i);
			}
			fr.close();
			//System.out.println(data);
			
			JSONParser jp = new JSONParser();
			JSONObject root  = (JSONObject) jp.parse(data);
			System.out.println(root.toJSONString());
			
			JSONArray arr = (JSONArray) root.get("genie");
			System.out.println(arr.toJSONString());
			
			//System.out.println(arr.size());
			for(i=0;i<50;i++) {
	 			music[i]=new MusicVO(); 
    			System.out.println("music["+i+"]:"+music[i]);
    			JSONObject obj=(JSONObject)arr.get(i);
    			System.out.println(obj.toJSONString());
    			music[i].setRank(Integer.parseInt((String)obj.get("rank")));
    			music[i].setTitle((String)obj.get("title"));
    			music[i].setSinger((String)obj.get("singer"));
    			music[i].setPoster((String)obj.get("poster"));
    			music[i].setMovie((String)obj.get("movie"));
			}
			
		}catch(Exception ex) {}
		return music;
	}
	public static void main(String[] args) {
		MusicManager m = new MusicManager();
		MusicVO[] data = m.MusicAllData();
		System.out.println("==========music list==========");
		for(MusicVO vo:data) {
			System.out.println("순위: "+vo.getRank());
			System.out.println("노래명: "+vo.getTitle());
			System.out.println("가수명: "+vo.getSinger());
			System.out.println("이미지: "+vo.getPoster());
			System.out.println("동영상: "+vo.getMovie());
			System.out.println("===============================");
		}
	}

}
