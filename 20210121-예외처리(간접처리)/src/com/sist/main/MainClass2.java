package com.sist.main;
/*
 *   ���� ȸ�� : �ý��ۿ��� ó�� => throws
 *   ����)
 *        ���������� ������ �޼ҵ��(�Ű�����..) throws ����Ǵ� ������� ....
 *        
 *        ��)
 *            public void display() throws NumberFormatException,NullPointerException,
 *                                  ClassCastException,Exception
 *                                  ================================ ������ ����
 *            => display() ȣ��ÿ� 
 *                 = ȸ��
 *                 public void main() throws NumberFormatException,NullPointerException,
 *                                    ClassCastException,Exception
 *                 {
 *                    display();
 *                 }
 *                 
 *                 public void main() throws Exception
 *                 {
 *                    display()
 *                 }
 *                 
 *                 public void main() throws Throwable
 *                 {
 *                     display()
 *                 }
 *                 = ����
 *                 public void main()
 *                 {
 *                      try
 *                      {
 *                         display()
 *                      }catch(Exception ex){}
 *                 }
 */
// ���̺귯�� 
import java.io.*;
public class MainClass2 {
    public void display() throws Exception,NumberFormatException,ArithmeticException,ArrayIndexOutOfBoundsException
    {
    	
    }
	public static void main(String[] args) throws Exception{
        MainClass2 m=new MainClass2();
        FileReader fr=new FileReader("c:\\javaDev\\movie.json");
	}

}










