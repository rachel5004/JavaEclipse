/*
 *    ��ø => if�ȿ� if�� ÷�� (���� if)
 *    ����)
 *         if(���ǹ�) ���ǹ� true
 *         {
 *            if(���ǹ�) true
 *            {
 *               ���๮�� 
 *            }
 *         }
 *         
 *         ==> if(���ǹ� && ���ǹ�)
 */
// 3�������� ������ �޾Ƽ� ���,���� , ���� ( >=98 A+  94<= A-)
import java.util.Scanner;
public class ��ø���ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // �����ϴ� ������=>�޸� (����)
		int kor,eng,math,total,avg;
		char score=' ',option=' '; // +,-,0  A+ A- A0
		// �ʱⰪ 
		Scanner scan=new Scanner(System.in);
		// ����,����,���� 
		System.out.print("�������� �������� �������� �Է�(90 90 90):");
		kor=scan.nextInt();
		eng=scan.nextInt();
		math=scan.nextInt();
		
		// ���� 
		total=kor+eng+math;
		// ���
		avg=total/3;
		// ���� 
		if(avg>=90)
		{
			score='A';
			if(avg>=98)
			{
				option='+';
			}
			else if(avg<94)
			{
				option='-';
			}
			else
			{
				option='0';
			}
		}
		else if(avg>=80)
		{
			score='B';
			if(avg>=88)
			{
				option='+';
			}
			else if(avg<84)
			{
				option='-';
			}
			else
			{
				option='0';
			}
		}
		else if(avg>=70)
		{
			score='C';
			if(avg>=78)
			{
				option='+';
			}
			else if(avg<74)
			{
				option='-';
			}
			else
			{
				option='0';
			}
		}
		else if(avg>=60)
		{
			score='D';
			if(avg>=68)
			{
				option='+';
			}
			else if(avg<64)
			{
				option='-';
			}
			else
			{
				option='0';
			}
		}
		else
		{
			score='F';
		}
		// ��� 
		System.out.println("����:"+kor);
		System.out.println("����:"+eng);
		System.out.println("����:"+math);
		System.out.println("����:"+total);
		System.out.println("���:"+avg);
		System.out.printf("����:%c%c\n",score,option);
	}

}













