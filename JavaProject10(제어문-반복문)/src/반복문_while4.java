// while : �ݺ�Ƚ���� ���� ��쿡 �ַ� ��� 
// UP-DOWN���� 
/*
 *     ���� : ���� (1~100������ �����߻�)
 *           ======================= ���ߴ� ���� 
 *           ��Ʈ : UP , DOWN
 *           ���� : 70
 *           ����� �Է� : 80 ==> DOWN
 *           ����� �Է� : 65 ==> UP
 *           
 *     ���� ���� 
 *     =======
 *     1. ���� �߻� => �޸� ���� 
 *     2. ����� �Է� 
 *     3. ������ ������Է��� �� 
 *     4. ��Ʈ
 *     5. ���Ῡ�� Ȯ�� => true ==> �������� 
 *                      false ==> 2������ �̵�
 */
// ����� �Է°��� �ޱ� 
import java.util.Scanner;
public class �ݺ���_while4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. (1~100)������ �����Ѱ��� ���� (������ ����=>����)
		int com=(int)(Math.random()*100)+1;
		/*
		 *   1.(Math.random()*100) ==> 0.0~0.99 ==> 0.0~99.0
		 *   2.(int) 0.0~0.99 ==> int ==> 0~99
		 *   3.+1  ==> 1~100
		 */
		// ����� �Է� => �����϶����� 
		Scanner scan=new Scanner(System.in);
		while(true) //���ѷ��� 
		{
			// 1. ����� �Է°��� �޴´� 
			System.out.print("1~100���� ������ ���� �Է�:");
			// ����
			int user=scan.nextInt();
			// 2. ������ �Էº� 
			// 3. ��Ʈ 
			// 4. ���� 
			if(com>user)
			{
				System.out.println("�Է°����� ū���� �Է��ϼ���");// UP
			}
			else if(com<user)
			{
				System.out.println("�Է°����� ���� ���� �Է��ϼ���");//DOWN
			}
			else
			{
				// com==user
				System.out.println("Game Over!!");
				// ���α׷� ���� 
				System.exit(0);// ���� ���Ḧ �Ѵ� 
				//break;
			}
		}
		
		//System.out.println("���α׷� ����");
	}

}










