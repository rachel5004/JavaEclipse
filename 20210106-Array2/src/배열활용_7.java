// equals : ���ڿ� �� (�Ϲ� ������ ==)
import java.util.Scanner;
public class �迭Ȱ��_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final String ID="Admin"; // char[] id={'A','d','m','i','n'}
        final String PWD="1234"; // ��� 
        
        Scanner scan=new Scanner(System.in);
        String myid="";
        String mypwd="";
        
        System.out.print("ID�� �Է��ϼ���?");
        myid=scan.next();
        
        System.out.print("��й�ȣ�� �Է��ϼ���?");
        mypwd=scan.next();
        /*
         *    equalsIgnoreCase = ��ҹ��� ���� ���� 
         *    equals = ��ҹ��� ���� 
         *    Java JAVA JaVa 
         */
        if(myid.equalsIgnoreCase(ID) && mypwd.equals(PWD))
        {
        	System.out.println(myid+"�� �α��εǾ����ϴ�");
        }
        else
        {
        	System.out.println("ID�� ��й�ȣ�� Ʋ���ϴ�");
        }
        
	}

}







