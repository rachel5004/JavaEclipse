// ���� �ϳ��� �Է¹޾� �빮������ �ҹ��������� �Ǻ��ϴ� ���α׷�
import java.util.Scanner;
public class ����17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("���ĺ� ���ڿ� �Է�:");
        String alpha=scan.next();
        for(int i=0;i<alpha.length();i++)
        {
        	char c=alpha.charAt(i);
        	if(c>='A' && c<='Z')
        	  System.out.println(c+"��(��) �빮���Դϴ�");
        	else if(c>='a' && c<='z')
        	  System.out.println(c+"��(��) �ҹ����Դϴ�");	
        	else
        	  System.out.println(c+"��(��) ���ĺ��� �ƴմϴ�");
        		
        }
	}

}
