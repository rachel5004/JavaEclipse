import java.util.*;
public class MainClass {

	static int menu()
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("============= �޴� ============");
		System.out.println("1. ��ü ���");
		System.out.println("2. �뷡 ã��");
		System.out.println("3. ���� �뷡 ã��");
		System.out.println("4. �� ����");
		System.out.println("5. ����");
		System.out.println("===============================");
		
		int m=0;
		while(true)
		{
		   System.out.print("�޴��� �����ϼ���?");
		   m=scan.nextInt();
		   if(m<1 || m>5)
		   {
			   System.out.println("���� �޴��Դϴ�.");
			   continue;
		   }
		   break;
		}
		return m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        menu();
	}

}
