package com.sist.main;
import java.io.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/*
 *   ================================
 *    1. 클래스 : public 
 *    2. 생성자 : public 
 *    3. 메소드 : public , protected
 *    4. 변수 : private
 *       = 지역변수 : final 
 *   =================================
 *   static , abstract , final 
 *   
 *   클래스 : public ,(default) , final , abstract
 *           = public class
 *           = class 
 *           
 *           예)
 *               => 일반 클래스 
 *               public class className{
 *               }
 *               
 *               => 종단 클래스 (상속하지 않는다) => 품절(거의 사용빈도 없다)
 *               public final class className{
 *               }
 *               
 *               => 추상 클래스 (자신이 메모리 할당을 할 수 없다) => new를 사용하지 않는다
 *               public abstract class className{
 *               }
 *               
 *               => public static class className(사용할 수 없다)
 *                   only public, abstract & final
 *   메소드 : public , protected , abstract , static , final 
 *   변수 : private , static , final 
 */
public class MovieManager {
    public MovieVO[] movieAllData()
    {
    	MovieVO[] movie = new MovieVO[7]; 
    	try
    	{
    		FileReader fr=new FileReader("c:\\javaDev\\movie.json");
       		String data="";
       		int i=0;
       		while((i=fr.read())!=-1) // -1 파일끝  read()=>한글자씩 읽어온다 
    		{
    			data+=String.valueOf((char)i);
    		}
    		fr.close();
    		
    		// 파싱 (파일에서 관련된 데이터 읽기)
    		JSONParser jp=new JSONParser();
       		JSONObject root=(JSONObject)jp.parse(data);
       		System.out.println(root.toJSONString());// 문자열 변환 
    		
       		JSONArray arr=(JSONArray)root.get("datas");
       		System.out.println(arr.toJSONString());
    		
    		//System.out.println(arr.size());
    		for(i=0;i<7;i++)
    		{
    			movie[i]=new MovieVO();// 객체 배열 
       			System.out.println("movie["+i+"]:"+movie[i]);
       			JSONObject obj=(JSONObject)arr.get(i);
       			System.out.println(obj.toJSONString());
//    			long mno = (long)obj.get("mno");
//    			movie[i].setMno(Integer.parseInt(String.valueOf(mno)));
       			movie[i].setTitle((String)obj.get("title"));// 데이터를 한개씩 읽어 온다 
       			movie[i].setActor((String)obj.get("actor"));
       			movie[i].setPoster((String)obj.get("poster"));
       			movie[i].setDirector((String)obj.get("director"));
       			movie[i].setGrade((String)obj.get("grade"));
       			movie[i].setStory((String)obj.get("story"));
    		}
    	}catch(Exception ex){}
    
    	return movie;
    }
    public static void main(String[] args) {
		MovieManager mm = new MovieManager();
		MovieVO[] movie = mm.movieAllData();
		System.out.println("==========movie list==========");
		for(MovieVO vo:movie) {
			System.out.println("제목: "+vo.getTitle());
			System.out.println("감독: "+vo.getDirector());
			System.out.println("배우: "+vo.getActor());
			System.out.println("이미지: "+vo.getPoster());
			System.out.println("등급: "+vo.getGrade());
			System.out.println("mno: "+vo.getMno());
			System.out.println("스토리: "+vo.getStory());
			System.out.println("===============================");
		}
	}


}















