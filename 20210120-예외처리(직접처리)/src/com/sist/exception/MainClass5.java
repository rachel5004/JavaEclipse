package com.sist.exception;
// try~catch => ��ġ ������ ���ؾ� ó���� ���� 
public class MainClass5 {

	public static void main(String[] args) {
        int[] arr={10,20,30,20,0,10,20,30,40,50};
        int a=100;
        try
        {
        	for(int b:arr)
        	{
        		try
        		{
        		   System.out.println(a/b);
        		}catch(Exception e) {}
        	}
        }catch(Exception ex)
        {
        	ex.printStackTrace();
        }
        System.out.println("���α׷� ����!!");
	}

}
