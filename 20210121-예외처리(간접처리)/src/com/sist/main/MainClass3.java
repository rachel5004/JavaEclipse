package com.sist.main;
/*
 *   ���� 
 *   ȸ�� => ���� ��� (������ �� ����)  throws
 *   ��ȯ => ���ǿ� ������ �߻��� �� �ִ� throw
 *   
 *   ���α׷� ���� 
 *   ==========
 *     �ڹ� : �̱� => �ѱ� (����) => ����� ���� 
 */
public class MainClass3 {

	public static void main(String[] args){
        try
        {
        	String s=" 100";
        	int i=Integer.parseInt(s);// ���ڿ��� ������ ��ȯ 
        }catch(NumberFormatException ex)
        {
        	try
        	{
        	   System.out.println("���� ��ȯ ����");
        	
        	   throw new Exception(); // ���� ó�� ȣ��
        	   // throw => ����� ���� ����ó���� ȣ���Ҷ� �ַ� ��� 
        	   // throw => �������ٿ� �ҽ� �ڵ��� �Ѵ� 
        	}catch(Exception e)
        	{
        		System.out.println("�ٽ� �Է��ϼ���!!");
        	}
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
        	System.out.println("�迭 ���� �ʰ�");
        }
        catch(Exception ex)
        {
        	
        }
	}

}
