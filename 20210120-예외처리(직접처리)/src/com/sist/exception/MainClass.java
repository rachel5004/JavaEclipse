package com.sist.exception;
/*
 *    ���� 
 *     1. ���� : �ҽ��󿡼� ������ �� ���� ���� : �޸� ����,�ü�� ����... 
 *     2. ���� : �ҽ��󿡼� ������ �� �ִ� ���� : ������� �Է��� �߸��� ���,���ϸ��� Ʋ����
 *        ==================================================================
 *        ���� ȸ�� : ���� ó�� throws
 *        ���� ó�� : ���� ó�� try~catch
 *                  ���� �߻� throw
 *                  ����� ���� ����ó�� 
 *    ======================================================================
 *    ����ó�� ���� : ������ ���� �����ϰ� ���� ���Ḧ �� �� �ְ� ����� ���� 
 *                 �̸� ������ ������ �� �ְ� ���� 
 *                 ���� : ���α׷��� �Ǽ� , ����� �Է�
 *                       =======================
 *    A.java  ============> A.class(0,1) ==============> ���پ� �о ���
 *    ���üҽ�       javac                     java
 *    (���α׷���)
 *                ========                   =====
 *                
 *                1. ������ ���� : �ݵ�� ����ó�� 
 *                2. ����� ���� : ����ó���� ������ �� �ִ�(�ʿ�� ����ó���� �� �� �ִ�)
 *                
 *            ================================================
 *              Check Exception        NON-Check Exception
 *            ================================================
 *              �����Ͻÿ� Ȯ��            ����ÿ� Ȯ�� (����ó���� ��� �ȴ�)
 *              
 *                            ����ó���� ������ 
 *                            ==============
 *                              
 *                              Object
 *                                |
 *                             Throwable
 *                                |
 *                      -------------------------
 *                      |                       |
 *                    Error                  Exception
 *                                 Check        |               NON-Check
 *                                 ----------------------------------------
 *                                 |                                      |
 *                             IOException(����)                           |
 *                             InterruptedException(������)                 |
 *                             URLMalformedException(��Ʈ��ũ)              |
 *                             ClassNotException                          |
 *                             SQLException(�����ͺ��̽�)                    |
 *                                                                RuntimeException
 *                                                                      |
 *                                                                ArrayIndexOutOfBoundsException
 *                                                                NumberFormatException
 *                                                                ArithmeticException
 *                                                                NullPointerException
 *                                                                ClassCastExeption
 *                                                                
 *                                                                
 *         ����ó�� 
 *           = ���� ���� (���� ó��)
 *             try
 *             {
 *                 ���� ���๮�� 
 *             }catch(){
 *                 ������� => �����߻��� �ϸ� ����
 *             }
 *           = ���� ȸ�� (���� ���ѱ��) : �ڹٽý���  => throws
 *           = ���� ��ȯ (������ �߻��� �������� => �ٸ� ���ܸ� �߻�) => throw (����� ���� ����)
 *           
 *            
 *                       
 */
public class MainClass {

	public static void main(String[] args) {
		/*int a=10;
		int b=0;
		int result=a/b;// ���α׷� ���� => ������ ���� 
		System.out.println("���α׷� ����!!");*/
		try
		{
			int a=10;
			int b=0;// ���� 
			int result=a/b; // ���� �߻� ===> catch�̵� 
			System.out.println("result="+result);
		}catch(Exception e)
		{
			System.out.println("���α׷� ����!!");// {} ���� �ҽ��� �̵�
		}
		System.out.println("���α׷� ����");
	}

}














