/*
 *   ���������� (���׿�����) 
 *   ������ ��ȣ : !
 *   ����ϴ� ���������� boolean 
 *    true=>false
 *    false=>true
 *    
 *    ==> ������� boolean => ���ǹ� (if())
 *    
 *    != ==
 */
import java.util.Scanner;//Ű����� �Է°��� �޴� ��� ��� 
public class ������_���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Scanner ���� 
		/*
		 *   �������� 
		 *   �������� ������=�� 
		 *   int i=10;
		 *   Ŭ���� ���� 
		 *   Ŭ������ ������(��ü) = new ������()
		 *                     ====== Ŭ������� ���� 
		 */
		Scanner scan=new Scanner(System.in);//System.in=> Ű���尪�� �о�ö� 
		System.out.print("true/false�Է�:");
		boolean bCheck=scan.nextBoolean();
		System.out.println("bCheck="+bCheck);
		// ����
		System.out.println("������ :"+!bCheck);
		
	}

}








