/*
 *   �� ���� ������ �Է� �޾Ƽ� ù° ���� ��° ���� ���� �������� ����ϴ� ���α׷��� �ۼ��� ����.
 *                        ======  ======
 *                          a       b  ==> a%b
 */
import java.util.Scanner;
public class ����14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("�ΰ��� ���� �Է�(10 20)?");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.printf("%d %% %d = %d\n",a,b,a%b);
	}

}
