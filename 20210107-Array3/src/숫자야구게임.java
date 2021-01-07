/*
 *   1. (1~9) �ߺ��� ���� ���� 3�� ���� => �迭 
 *      ==========================
 *   2. ����ڰ� �Է��ؼ� ���ߴ� ���� 
 *      2-1. ����� �Է°��� �޴´� => �迭
 *      2-2. ��
 *      2-3. ��Ʈ  ===> S-B
 *           ===
 *           1) ���ڰ� ���� = �ڸ����� �´� ���
 *           2) ���ڰ� ���� = �ٸ��ڸ��� �ִ� ���
 *              369  => 378  ==> 1S
 *              369  => 123  ==> 1B
 *              369  => 398  ==> 1S-1B
 *   3. ���Ῡ�� Ȯ�� => S(3)
 *   
 *   �޼ҵ� VS �Լ� => Ŭ���� ����
 */
import java.util.Scanner;
public class ���ھ߱����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ��ǻ�� ���� 3���� ���� 
		int[] com={3,6,9};
		// ����� �Է��� ������ ���� 
		int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("���ڸ� ���� �Է��ϼ���?");
			int input=scan.nextInt();
			// ���� ó�� 
			if(input<100 || input>999)
			{
				System.out.println("�߸��� �Է��Դϴ�!!");
				// ó������ ���ư��� 
				continue; // while => ���ǽ����� �̵� 
			}
			// 567/100 => 5
			user[0]=input/100;
			// 567%100 => 67/10 => 6
			user[1]=(input%100)/10;
			user[2]=input%10; 
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("�ߺ��� ���� ��� �� �� �����ϴ�!!");
				// �ٽ� �Է� ��û
				continue;
			}
			
			// �� ���� 
			int s=0,b=0;
			for(int i=0;i<3;i++) // com
			{
				for(int j=0;j<3;j++) // user
				{
					// ���� ���� �ִ��� Ȯ�� 
					if(com[i]==user[j])
					{
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			// ��Ʈ 
			//System.out.printf("Input Number:%d,Result:%dS-%dB\n",input,s,b);
			System.out.println("========== ��� ==========");
			System.out.print("S:");
			for(int i=0;i<s;i++)
			{
				System.out.print("��");
			}
			System.out.println();
			System.out.print("B:");
			for(int i=0;i<b;i++)
			{
				System.out.print("��");
			}
			System.out.println();
			// ���Ῡ�� 
			if(s==3)
			{
				System.out.println("Game Over!!");
				break;
			}
		}
	}

}










