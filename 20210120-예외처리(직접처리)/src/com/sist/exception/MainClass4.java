package com.sist.exception;
/*
 *   ���� �޼��� Ȯ�� 
 *     getMessage() : ���������� ��� 
 *     printStackTrace() : �����ϴ� ���� => ������ ��ġ �����Ѵ� 
 */
public class MainClass4 {

	public static void main(String[] args) {
        try
        {
        	System.out.println("����ó��");
        	System.out.println(10/0);
        }catch(Exception ex)
        {
        	//System.out.println(ex.getMessage());
        	ex.printStackTrace();
        }
        System.out.println("���α׷� ����");
	}

}
