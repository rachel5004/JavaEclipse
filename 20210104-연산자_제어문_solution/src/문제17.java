// ���� �ϳ��� �Է¹޾� �빮������ �ҹ��������� �Ǻ��ϴ� ���α׷�
import java.util.Scanner;
public class ����17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("���ڿ��� �Է��ϼ���?");
        String s=scan.next();
        // s.length() => �Էµ� ������ ����
        /*
         *    sdshdsidSS;;;
         *    0123456789 ==> length(10)
         *    ��й�ȣ üũ�ÿ� �ַ� ��� 
         */
        for(int i=0;i<s.length();i++)
        {
        	char c=s.charAt(i);
        	if(c>='A' && c<='Z')
        		System.out.println(c+"��(��) �빮���Դϴ�!!");
        	else if(c>='a' && c<='z')
        		System.out.println(c+"��(��) �ҹ����Դϴ�!!");
        	else
        		System.out.println(c+"��(��) ���ĺ��� �ƴմϴ�!!");
        	
        }
	}

}








