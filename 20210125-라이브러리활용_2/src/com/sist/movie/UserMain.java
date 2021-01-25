package com.sist.movie;
import java.util.Scanner;
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        // ��ȭ������ �� �������� �Է��Ͻÿ� 
        int totalpage=MovieManager.movieTotalPage();
        
        int page=1;
        // �������� �������� �ԷµǾ����� ����üũ 
        while(true)
        {
        	System.out.print("��ȭ ����� �� ������ ����(1~"+totalpage+"):");
        	String s=scan.next();
        	page=Integer.parseInt(s); // ���ڿ� ���������� ���� => ���ڿ� ���� => String.valueOf()
        	if(page<1 || page>totalpage)
        	{
        		System.out.println("�������� �ʴ� ������ �Դϴ�!!");
        		continue;
        	}
        	break;
        }
        System.out.println("===========���� ���� �ִ� �������� "+page+"������ �Դϴ�=============");
        MovieVO[] movie=MovieManager.movieListData(page);
        for(MovieVO vo:movie)
        {
        	if(vo==null) break;
        	System.out.println("��ȭ��ȣ:"+vo.getMno());
        	System.out.println("��ȭ��:"+vo.getTitle());
        	//System.out.println("�帣:"+vo.getGenre());
        	//System.out.println("����:"+vo.getDirector());
        	//System.out.println("�⿬:"+vo.getActor());
        	//System.out.println("���:"+vo.getGrade());
        	//System.out.println("������:"+vo.getRegdate());
        	System.out.println("============================================================");
        }
        System.out.print("��ȭ �� �� ��ȭ��ȣ�� �Է��ϼ���?");
        int detail_no=scan.nextInt();
        MovieVO vo=MovieManager.movieDetailData(detail_no);
        System.out.println("==================="+vo.getTitle()+" �󼼺���======================");
        System.out.println("��ȭ��ȣ:"+vo.getMno());
    	System.out.println("��ȭ��:"+vo.getTitle());
    	System.out.println("�帣:"+vo.getGenre());
    	System.out.println("����:"+vo.getDirector());
    	System.out.println("�⿬:"+vo.getActor());
    	System.out.println("���:"+vo.getGrade());
    	System.out.println("������:"+vo.getRegdate());
    	System.out.println("============================================================");
    	System.out.print("�⿬�� �̸��� �Է�:");
    	String name=scan.next();
    	String[] title=MovieManager.movieFindData(name.trim());
    	for(String t:title)
    	{
    		System.out.println(t);
    	}
    	System.out.println("============================================================");
    	System.out.print("��ȭ�� �Է�:");
    	String str=scan.next();
    	title=MovieManager.findTitleData(str.trim()); // trim()�� �¿��� ���鹮�� ���� 
    	for(String t:title)
    	{
    		System.out.println(t);
    		try
    		{
    			Thread.sleep(100); // Check Exception => ��ø��� 
    		}catch(Exception ex) {}
    	}
        
	}

}







