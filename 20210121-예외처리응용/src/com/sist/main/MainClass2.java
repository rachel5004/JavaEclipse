package com.sist.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 *    ���̺귯�� (API) : ������ �� ���� , Framework : ������ ���� 
 *    ==============
 *      java.lang.* : import���� ������ ���� => �ڹٿ��� ���� ���Ǵ� Ŭ���� 
 *        = Object :
 *        ***= String
 *        = StringBuffer / StringBuilder
 *        = Math
 *        ***= Wrapper(�⺻�� ��������=>Ŭ���������� ����)
 *        = System
 *      java.util.* 
 *        = Date , Calendar
 *        = StringTokenizer
 *        = Scanner
 *        = Collection
 *            List , Set , Map
 *        = Arrays
 *      java.io.*
 *      java.net.*
 *      java.text.*
 *      java.sql.*
 *      =============
 *      java.lang.*
 *      ========================
 *      Object : ��� �ɷ����� ���� Ŭ���� 
 *      ���(�޼ҵ�) :  clone() : �޸� ���� 
 *                   finalized() : �Ҹ���    A() ~A()
 *                   toString() : ��ü�� ���ڿ��� ��ȯ => �ּ� 
 *                   equals() : ��ü �� 
 *                 => ��� Ŭ������ �Ѱ��� ��Ƽ� ���� (Object:��� ���������� ��ȭ �� �� �ִ�)
 */
/*
 *    ��ü �����ֱ�  A 
 *    
 *    => ���� (�޸� ����)  ===> ��� Ȱ��(�޼ҵ� ȣ��) ===> �޸� ����
 *       new A()               a.display()            a=null; ==> GC
 */
class A
{

	public A()
	{
		System.out.println("A��ü ����...");
	}
	public void display()
	{
		System.out.println("A��ü Ȱ��...");
	}
	@Override
	protected void finalize() throws Throwable {
		// ��ü�� �Ҹ�ɶ� �ڵ� ȣ��ȴ� 
		System.out.println("A��ü �Ҹ�...");
	}
	@Override
	public String toString() {
		return "Hello";
	}
	
}
public class MainClass2 {

	public static void main(String[] args) {
        A a=new A();
        System.out.println(a.toString());
        System.out.println(a);// ��ü�� ��� => �ڵ� toString()�� ȣ���Ѵ� 
        a.display();
        a=null;
        System.gc();// ��Ƽ�̵�� => �Ҹ��� �޼ҵ带 ȣ���Ҷ� �ַ� ���
        try
        {
        	FileReader fr=new FileReader("");
        	Class.forName("");
        }catch(FileNotFoundException | ClassNotFoundException e)
        {
        	if(e instanceof FileNotFoundException)
        	{
        		System.out.println("������ ã�� �� ����");
        	}
        	if(e instanceof ClassNotFoundException)
        	{
        		System.out.println("Ŭ������ ã�� �� ����");
        	}
        	//System.out.println(e.getMessage());
        }
	}

}









