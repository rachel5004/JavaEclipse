// ������ �Է¹޾Ƽ�  ���� ���, ����, �������� ����Ͻÿ�.
import java.util.Scanner;
public class ����19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("���� �Է�:");
        int a=scan.nextInt();
        if(a>0)
        {
        	System.out.println(a+"��(��) ����Դϴ�");
        }
        else if(a<0)
        {
        	System.out.println(a+"��(��) �����Դϴ�");
        }
        else
        {
        	System.out.println(a+"��(��) �����Դϴ�");
        }
	}

}
