/*
 *     ���� �ۼ� => �θ��ô� 
 *     =======
 *     4�⸶�� 
 *     100�⸶�� ���� 
 *     400�⸶�� 
 *     
 *     if((year%4==0 && year%100!=0)||(year%400==0))
 *     {
 *         
 *     }
 *     
 *     ����ڷκ��� �� ���� ������ �Է� �޾Ƽ� ������ ���� ������ ����� ����ϴ� ���α׷��� �ۼ�
 */
import java.util.Scanner;
public class �ݺ���_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("�ΰ��� ������ �Է��Ͻÿ�(10 10)?");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.printf("%d-%d=%d\n",a,b,a-b);
        System.out.printf("%d*%d=%d\n",a,b,a*b);
	}

}
