/*
 *   5�� 
 *   ��ġ� - 5000
 *   �������� - 6000
 *   ����� - 4000
 */
import java.util.Scanner;
public class ����16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        int a,b,c;
        System.out.println("=====�޴�=====");
        System.out.print("��ġ� - 5000��?");
        a=scan.nextInt();
        System.out.print("�������� - 6000��?");
        b=scan.nextInt();
        System.out.print("����� - 4000��?");
        c=scan.nextInt();
        
        if((a+b+c)==5)
        {
        	int d=(a*5000)+(b*6000)+(c*4000);
        	int res=d/5;
        	System.out.println("1�δ� "+res+"�� ���");
        }
        else
        {
        	System.out.println("�ֹ��� �ʰ��ϼ̽��ϴ�");
        }
        
	}

}
