package com.sist.exception;
/*
 *    ����ڷκ��� 2���� �����޾Ƽ� �迭�� ������ ������ �ΰ� �������� ������� ��� 
 *                           =========            ======   
 *                           catch => 3�� (��Ÿ)
 *    ����Ǵ� ����?
 */
import java.util.Scanner;
public class MainClass3 {

	public static void main(String[] args) {
        try
        {
        	Scanner scan=new Scanner(System.in);
        	System.out.print("ù��° ���� �Է�:");
        	int a=scan.nextInt();
        	System.out.print("�ι�° ���� �Է�:");
        	int b=scan.nextInt();
        	
        	int[] arr={a,b};
        	int res=arr[0]/arr[2];
        	System.out.println("res="+res);
        	// catch�� ����� ����ó�� Ŭ������ ������ �����Ѵ� 
        	
        }
        catch(ArrayIndexOutOfBoundsException e) // �迭�� ������ ��� ��쿡�� ó���� ����
        {
        	System.out.println("�迭�� ������ �ʰ� �߽��ϴ�");
        }catch(ArithmeticException e) // 0���� �������Ҷ��� ó�� ����
        {
        	System.out.println("0���� ���� �� �����ϴ�");
        }catch(RuntimeException e)
        {
        	System.out.println("���� ���� ���� �߻��߽��ϴ�");
        }catch(Exception e)
        {
        	
        }
        System.out.println("���α׷� ����");
	}

}









