package com.sist.main;
import java.io.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/*
 *   ================================
 *    1. Ŭ���� : public 
 *    2. ������ : public 
 *    3. �޼ҵ� : public , protected
 *    4. ���� : private
 *       = �������� : final 
 *   =================================
 *   static , abstract , final 
 *   
 *   Ŭ���� : public ,(default) , final , abstract
 *           = public class
 *           = class 
 *           
 *           ��)
 *               => �Ϲ� Ŭ���� 
 *               public class className{
 *               }
 *               
 *               => ���� Ŭ���� (������� �ʴ´�) => ǰ��(���� ���� ����)
 *               public final class className{
 *               }
 *               
 *               => �߻� Ŭ���� (�ڽ��� �޸� �Ҵ��� �� �� ����) => new�� ������� �ʴ´�
 *               public abstract class className{
 *               }
 *               
 *               => public static class className(����� �� ����)
 *                   only public, abstract & final
 *   �޼ҵ� : public , protected , abstract , static , final 
 *   ���� : private , static , final 
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
       		while((i=fr.read())!=-1) // -1 ���ϳ�  read()=>�ѱ��ھ� �о�´� 
    		{
    			data+=String.valueOf((char)i);
    		}
    		fr.close();
    		
    		// �Ľ� (���Ͽ��� ���õ� ������ �б�)
    		JSONParser jp=new JSONParser();
       		JSONObject root=(JSONObject)jp.parse(data);
       		System.out.println(root.toJSONString());// ���ڿ� ��ȯ 
    		
       		JSONArray arr=(JSONArray)root.get("datas");
       		System.out.println(arr.toJSONString());
    		
    		//System.out.println(arr.size());
    		for(i=0;i<7;i++)
    		{
    			movie[i]=new MovieVO();// ��ü �迭 
       			System.out.println("movie["+i+"]:"+movie[i]);
       			JSONObject obj=(JSONObject)arr.get(i);
       			System.out.println(obj.toJSONString());
//    			long mno = (long)obj.get("mno");
//    			movie[i].setMno(Integer.parseInt(String.valueOf(mno)));
       			movie[i].setTitle((String)obj.get("title"));// �����͸� �Ѱ��� �о� �´� 
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
			System.out.println("����: "+vo.getTitle());
			System.out.println("����: "+vo.getDirector());
			System.out.println("���: "+vo.getActor());
			System.out.println("�̹���: "+vo.getPoster());
			System.out.println("���: "+vo.getGrade());
			System.out.println("mno: "+vo.getMno());
			System.out.println("���丮: "+vo.getStory());
			System.out.println("===============================");
		}
	}


}















