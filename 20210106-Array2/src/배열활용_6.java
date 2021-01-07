// ���ڿ� => String => char[] 
/*
 *   String : �������� , Ŭ���� (���ڿ��� ���� �� �� �ִ� ���=�޼ҵ�)
 *   ���ڿ����� �����Ѱ��� ������ �ö�   => charAt(0) 
 *      ABCDEFG
 *      0123456
 *   ���ڿ��� ���� Ȯ�� length()
 *   ���ڿ� �� equals => Login (id,pwd)
 *   ���ڿ� ���Ե� �ܾ� contains() 
 *   =============
 *   �����ϴ� ���ڿ� startsWith()
 *   ������ ���ڿ�  endsWith()
 *   ============= ������Ʈ (�˻�)
 *   ���ڿ� �ڸ��� substring()  ==> A.java  02)111-1111
 *   ���ڿ� => �빮�� , �ҹ��� 
 *           =====   =====
 *           toUpperCase() , toLowerCase()
 *   
 */
import java.util.Scanner;
public class �迭Ȱ��_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. ������ ���� ������ ���� (length())
		String data="Hello Java!!"; // ���鵵 ���� 
		System.out.println("������ ����:"+data.length());
		// 2. �빮�ڷ� ��ȯ (toUpperCase())
		System.out.println("�빮�� ��ȯ:"+data.toUpperCase()); //���ĺ��� ����
		// char c='a' ==> (c-32) ='A' a=97 A=65
		// 3. �ҹ��ڷ� ��ȯ (toLowerCase())
		System.out.println("�ҹ��� ��ȯ:"+data.toLowerCase());
		// 4. charAt(index) => ���ڿ��� ��ȣ 0�� ���� ���� 
		/*
		 *   Hello Java!!
		 *   01234567891011
		 *   
		 *   J ==> charAt(6)
		 */
		System.out.println("�����Ѱ� �б�:"+data.charAt(8));
		
		// 5. contains() => ���ڿ��߿� Ư�����ڰ� ���� => true/false
		System.out.println("���Կ���:"+data.contains("Java"));// LIKE => �����ȣ�˻�
		
		Scanner scan=new Scanner(System.in);
		String[] find_data={"�ڹٶ�",
							"�ڹ�",
							"�ڹٶ� ĭ����",
							"�ڹٶ� ȣ��",
							"�ڹ��� �ڹ�",
							"�ڹ� �ٿ�ε�",
							"�ڹٶ� ��",
							"�ڹٶ� �ڹ�",
							"�ڹٶ� Ŀư",
							"�ڹ� ��ũ��Ʈ",
							"�ڹ��� ��� �Ǿ��ޱ޿� ����",
							"�ڹٶ� �ڹ�",
							"�ڹٳ���",
							"�ڹٽ�ũ��Ʈ ���� �ذ�",
							"�ڹ� ����"};
		System.out.print("�˻��� �Է�:");
		String fd=scan.next();// �˻�� �޴´� 
		for(String s:find_data) // �ڵ� �ϼ��� (�˻���)  
		{
			//if(s.startsWith(fd))
			if(s.endsWith(fd))
			{
				System.out.println(s);
			}
		}
	}

}










