// ���� 1���� �Է��� �޾Ƽ� => 3,5,7�� ������θ� Ȯ�� => ���� ���ǹ� 3�� 
import java.util.Scanner;
public class �������ǹ�_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // �Է¹��� ������ ������ �޸� ���� : ���� 
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Ѱ��� �Է�:");
		// �зµ� ���� ==> �Է��ϰ� enter
		num=scan.nextInt();
		// ���� => 3�� ��� (%)
		// ���ǿ� �´� ��� ������ ���� => �������ǹ� �������� ����Ѵ� (�ߺ������� ������ ����)
		if(num%3==0)
			System.out.println(num+"��(��) 3�� ����Դϴ�");
		if(num%5==0)
			System.out.println(num+"��(��) 5�� ����Դϴ�");
		if(num%7==0)
			System.out.println(num+"��(��) 7�� ����Դϴ�");
	}

}
