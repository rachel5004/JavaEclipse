package com.sist.movie;
import java.io.*;
// String/StringBuffer
public class MovieManager {
   // ��� �����(user)�� ���� ��ȭ������ �����Ѵ� 
   private static MovieVO[] movie=new MovieVO[1938]; // �̱��� 
   // 1. ���Ͽ��� �����͸� �о �迭�� ���� => �ʱ�ȭ 
   /*
    *   1. ����� �ʱ�ȭ 
    *   2. ������ : ������� �Է°��� �޾Ƽ� �ʱ� : �����ε� 
    *   3. �ʱ�ȭ �� : ������� �Է°��� �޾Ƽ� �ʱ�ȭ (X) => �ν��Ͻ������� static���� ��쿡 �ַ� ��� 
    *   
    */
   static
   {
	   // ���Ͽ��� �о ������ �� �� �ִ� => ���� 
	   // ���� ��ü �б�
	   // ���� ������ => �и� => MovieVO�� ����
	   try
	   {
		   StringBuffer sb=new StringBuffer();
		   int i=0;
		   FileReader fr=new FileReader("c:\\javaDev\\movie.txt"); // IO(CheckException)
		   while((i=fr.read())!=-1)
		   {
			   sb.append(String.valueOf((char)i));//���ڸ� �ѱ�¥ �о �޸𸮿� �����Ѵ� 
			   // valueOf() : web,������,��Ʈ��ũ => ���ڿ��� ���(String)
		   }
		   fr.close();
		   // �迭�� ���� 
		   String data=sb.toString();
		   String[] movie_data=data.split("\n");
		   i=0;// �迭 ÷��(�迭 �ε���)
		   // String m==> 1938
		   for(String m:movie_data)
		   {
			   //System.out.println(m);
			   String[] vo=m.split("\\|"); // split�� ���Խ� => ������� 
			   movie[i]=new MovieVO();// 1938�� ���� 
			   // MovieVO[] movie=new MovieVO[1938]; => �޸𸮰� ���� 
			   // MovieVO[] movie={null,null,......}
			   // int[] arr=new int[10]; => 0,0,0
			   // arr[0]=10;
			   movie[i].setMno(Integer.parseInt(vo[0])); 
			   // ���ڿ��� ������ ��ȯ Integer.parseInt(���ڿ�)
			   movie[i].setTitle(vo[1]);
			   movie[i].setGenre(vo[2]);
			   movie[i].setPoster(vo[3]);
			   movie[i].setActor(vo[4]);
			   movie[i].setRegdate(vo[5]);
			   movie[i].setGrade(vo[6]);
			   movie[i].setDirector(vo[7]);
			   //System.out.println("����:"+(i+1));
			   /*
			    *    ^ : ���� , ����    [^A-Z]:���ĺ� �빮�� ���� , ^[A-Z] : �빮�ڷ� ����
			    *    $ : �� [0-9] : ���ڷ� ���� ���ڿ�
			    *    + : �ѱ��� �̻��� ���� 
			    *        ����+ => ���ִ� , ���ְ� ...
			    *    * : 0�̻� 
			    *    | : ����   => ����|����
			    *    ? : �տ�,�ڿ� �ѱ��� ���� 
			    *    . : ������ �ѱ� 
			    *    ===> �Ϲ� ���ڿ��� ��� => \\
			    */
			   i++;
		   }
	   }catch(Exception ex){ex.printStackTrace();}
   }
   
   /*
    *    class A
    *    {
    *        ���� ���� (����ó��,���,����ó�� , ������ (X))
    *        int a=10; (O)
    *        int a;
    *        a=10; (X)
    *    }
    */
   // ��� ���� (�޼ҵ�)
   // ù��° => ��� ��� 
   public static MovieVO[] movieListData(int page)
   {
	   // ������ ������ 
	   MovieVO[] m=new MovieVO[10];
	   if(page==movieTotalPage())
	   {
		   m=new MovieVO[movie.length%10];
	   }
	   
	   int j=0;// 10���� �����ִ� ���� 
	   int rowSize=10;
	   int pagecnt=(rowSize*page)-rowSize;// �������� ������ 
	   /*
	    *   1page => 0~9
	    *   2page => 10~19
	    */
	   for(int i=0;i<movie.length;i++)
	   {
		   if(j<10 && i>=pagecnt)
		   {
			   m[j]=movie[i];
			   j++;
		   }
	   }
	   
	   return m;
   }
   // �ι�° => �������� 
   public static int movieTotalPage()
   {
	   int count=movie.length;
	   int total=(int)(Math.ceil(count/10.0)); // 1938/10.0  => 193.8(0�̻�=> �ø�) => 194
	   return total;
   }
   // ��ȭ �󼼺��� => MovieVO (��ȭ 1���� ���� ��� ����) => ArrayList,Vector(�÷���)
   public static MovieVO movieDetailData(int mno)
   {
	   MovieVO vo=new MovieVO();
	   // vo�� ���� ä��� 
	   vo=movie[mno-1];// ��ȭ��ȣ=> 1������ , �迭�� �ε���=>0������ 
	   return vo;
   }
   /*
    *    1. ��� => ��ȭ ���� ������ => �Ѱ��� ��� ���� 
    *                              =========== MovieVO[]
    *    2. ��ȭ 1���� �� ���� => MovieVO
    *    
    *    3. ��ȭ�� ��� (������: String[] ,�Ѱ�: String)
    *    
    *    Ŭ���� : �������� �ٸ� �����͸� ��� �����ϴ� �������� 
    *           ================= ���:�Ѹ� ���� ��� ���� , ��ȭ : ��ȭ �Ѱ��� ���� 
    */
   // �⿬�ڷ� => ��ȭ ���� ��� : contains 
   //public static String[]
   public static String[] movieFindData(String actor)
   {
	   /// �迭�� ���� �ϱ� ���� �� ������ Ȯ�� 
	   // �迭������ ���� ������ (������ �ƴϴ�..) : �÷��� 
	   int count=0;
	   for(MovieVO vo:movie)
	   {
		   if(vo.getActor().contains(actor))
		   {
			   count++;
		   }
	   }
	   
	   String[] movie_title=new String[count];
	   int i=0;
	   for(MovieVO vo:movie)
	   {
		   if(vo.getActor().contains(actor))
		   {
			   movie_title[i]=vo.getTitle();
			   i++;
		   }
	   }
	   return movie_title;
   }
   // ��ȭ�� => ��ȭ ã�� : contains
   public static String[] findTitleData(String title)
   {
	   int count=0;
	   for(MovieVO vo:movie)
	   {
		   if(vo.getTitle().startsWith(title))
		   {
			   count++;
		   }
	   }
	   String[] movie_title=new String[count];
	   int i=0;
	   for(MovieVO vo:movie)
	   {
		   if(vo.getTitle().startsWith(title))
		   {
			   movie_title[i]=vo.getTitle();
			   i++;
		   }
		   
	   }
	   return movie_title;
   }
   // �����ϴ� ��ȭ�� ã�� : startsWith,endsWith
   
}













