// ������ �Է¹޾Ƽ�  ���� ���, ����, �������� ����Ͻÿ�:���� ���ǹ� 
/*
 *   char a='1'
 *   if(a>='A' && a<='Z')
 *      System.out.println("�빮��")
 *   else 
 *      System.out.println("�ҹ���")
 */
import java.util.Scanner;
public class ����19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("���� �Է�:");
        // �Էµ� ���� �޾Ƽ� �޸� ���� 
        int a=scan.nextInt();
        
        if(a>0)
        	System.out.println(a+"��(��) ����Դϴ�");
        else if(a<0)
        	System.out.println(a+"��(��) �����Դϴ�");
        else
        	System.out.println(a+"��(��) �����Դϴ�");
	}

}
