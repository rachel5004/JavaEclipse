/*
 *    ����ڷκ��� �� ���� ������ �Է¹��� ������ ���� ���� ������� �����ؼ� �� ����� ����ϴ� 
 *    ���α׷��� �ۼ��� �� ��.
 *     ���� ��� ����ڷκ��� ������� �Է¹��� �� ���� ������ 1, 2, 3 �̶�� 
 *     1 * 2 + 3�� ��� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 

 */
import java.util.Scanner;
public class ����13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("������ ���� �Է�(10 20 30)?");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=a*b+c;
        System.out.println("d="+d);
	}

}
